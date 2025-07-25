package com.example.flintor

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class Useracc : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_useracc, container, false)

        // Find the button
        val btnNavigate: ImageView = view.findViewById(R.id.imageView28)

        // Set click listener to navigate to SecondActivity
        btnNavigate.setOnClickListener {
            val intent = Intent(requireContext(), OnboardScreenLast::class.java)
            startActivity(intent)
        }

        return view
    }
}