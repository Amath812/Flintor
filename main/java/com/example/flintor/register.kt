package com.example.flintor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            WindowInsetsCompat.CONSUMED
        }

        // Find the TextView by its ID
        val signinTextView = findViewById<TextView>(R.id.r6) // Replace with your TextView ID

        // Initialize button using findViewById
        val nextButton = findViewById<Button>(R.id.creataccbtn)

        // Set an OnClickListener to navigate when clicked
        signinTextView.setOnClickListener {
            val intent = Intent(this, login::class.java) // Replace with your target Activity
            startActivity(intent)
        }
        nextButton.setOnClickListener {
            val intent = Intent(this, login::class.java) // Replace with your target Activity
            startActivity(intent)
        }
    }
}