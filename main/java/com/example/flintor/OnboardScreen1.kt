package com.example.flintor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardScreen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen1)

        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            // Return the correct WindowInsetsCompat object
            WindowInsetsCompat.CONSUMED
        }

        // Find the TextView by its ID
        val skipTextView = findViewById<TextView>(R.id.onboardt3) // Replace with your TextView ID

        // Initialize button using findViewById
        val nextButton = findViewById<Button>(R.id.nextbtn1)

        // Set onClickListener for nextButton
        nextButton.setOnClickListener {
            val intent = Intent(this, OnboardScreen2::class.java)
            startActivity(intent)
        }
        skipTextView.setOnClickListener {
            val intent = Intent(this, OnboardScreenLast::class.java)
            startActivity(intent)
        }
    }
}
