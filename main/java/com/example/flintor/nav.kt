package com.example.flintor

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView





class nav : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Load HomeScreen fragment by default
        if (savedInstanceState == null) {
            loadFragment(Home())
        }

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeid -> loadFragment(Home())
                R.id.likeid -> loadFragment(Like())
                R.id.alertid -> loadFragment(Notification())
                R.id.accid -> loadFragment(Useracc())

            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}