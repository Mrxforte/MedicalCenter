package com.example.medicalcenter.walk_through_screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicalcenter.R
import com.example.medicalcenter.databinding.ActivityWalkThroughScreen1Binding
import com.example.medicalcenter.databinding.ActivityWalkThroughScreen2Binding

class WalkThroughScreen2 : AppCompatActivity() {
    private lateinit var binding: ActivityWalkThroughScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWalkThroughScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loadUI()
    }

    private fun loadUI() {
        binding.nextButton.setOnClickListener {
//          navigates to next screen
            val intent = Intent(this, WalkThroughScreen3::class.java)
            startActivity(intent)

        }

    }
}