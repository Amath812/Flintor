package com.example.flintor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardScreenLast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen_last)
        // Apply window insets correctly
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            // Return the correct WindowInsetsCompat object
            WindowInsetsCompat.CONSUMED
        }

        // Initialize button using findViewById
        val nextButton1 = findViewById<Button>(R.id.signupbtn)
        val nextButton2 = findViewById<Button>(R.id.SignInbtn)

        // Set onClickListener for nextButton
        nextButton1.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
        nextButton2.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}