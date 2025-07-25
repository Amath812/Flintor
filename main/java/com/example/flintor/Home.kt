package com.example.flintor

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the button
        val btnNavigate: ImageView = view.findViewById(R.id.imageView10)

        // Set click listener to navigate to SecondActivity
        btnNavigate.setOnClickListener {
            val intent = Intent(requireContext(), Cookingpg::class.java)
            startActivity(intent)
        }

        return view

    }
}