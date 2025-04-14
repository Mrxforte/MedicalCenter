package com.example.medicalcenter.walk_through_screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicalcenter.R
import com.example.medicalcenter.databinding.ActivityWalkThroughScreen3Binding
import com.example.medicalcenter.log_in_screens.SocialLoginScreen

class WalkThroughScreen3 : AppCompatActivity() {
    private lateinit var binding: ActivityWalkThroughScreen3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWalkThroughScreen3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loadUI()
    }

    private fun loadUI() {
//        change the code later
        val intent = Intent(this, SocialLoginScreen::class.java)
        startActivity(intent)
    }
}