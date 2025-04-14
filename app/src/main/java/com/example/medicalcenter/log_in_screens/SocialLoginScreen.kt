package com.example.medicalcenter.log_in_screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicalcenter.R
import com.example.medicalcenter.databinding.ActivityLoginScreenBinding

class SocialLoginScreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.googleButton?.setOnClickListener() {
            //
        }
        binding.facebookButton?.setOnClickListener() {}

        binding.appleButton?.setOnClickListener() {}
        binding.arrowImageButton.setOnClickListener() {
            finish()
        }
        binding.orSignUpButton?.setOnClickListener() {
            var login = "login"
            val intent = Intent(this, SignUpScreen::class.java)
            intent.putExtra("login", login)
            startActivity(intent)
        }
        binding.signInWithPasswordButton?.setOnClickListener() {
            var intent = Intent(this, SignInScreen::class.java)
            startActivity(intent)
        }
    }

}