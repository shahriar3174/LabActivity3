package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText // Declare this to make code cleaner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)

        clickMeButton.setOnClickListener {
            val nameInput = nameEditText.text.toString()

            // Requirement 3.1: Change behavior to show error if text is empty
            if (nameInput.trim().isEmpty()) {
                displayTextView.text = "Error: Please enter your name!"
            } else {
                displayTextView.text = "Hello, $nameInput!"
            }
        }
    }
}