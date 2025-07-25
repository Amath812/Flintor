package com.example.flintor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            WindowInsetsCompat.CONSUMED
        }

        // Find the TextView by its ID
        val signupTextView = findViewById<TextView>(R.id.l2)

        // Initialize button using findViewById
        val nextButton = findViewById<Button>(R.id.loginbtn1)

        signupTextView.setOnClickListener {
            val intent = Intent(this, register::class.java) // Replace with your target Activity
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, nav::class.java) // Replace with your target Activity
            startActivity(intent)
        }
    }
}