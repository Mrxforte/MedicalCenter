package com.example.medicalcenter.log_in_screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicalcenter.R
import com.example.medicalcenter.databinding.ActivitySignInScreenBinding

class SignInScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignInScreenBinding
    private var isChecked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.arrowImageButton.setOnClickListener() {
            finish()
        }

        binding.checkButton.setOnClickListener {
            isChecked = true
            if (isChecked){
                binding.checkButton.setImageResource(R.drawable.checkbox_checked)
            }
        }

        binding.orSignUpButton.setOnClickListener() {
            var intent = Intent(this@SignInScreen, SignUpScreen::class.java)
            startActivity(intent)
        }

    }
}