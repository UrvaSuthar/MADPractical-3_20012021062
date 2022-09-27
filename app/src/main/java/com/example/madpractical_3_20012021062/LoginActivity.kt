package com.example.madpractical_3_20012021062

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.core.view.WindowCompat
import com.example.madpractical_3_20012021062.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)

        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.signup.setOnClickListener{
            Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
            binding.signup.movementMethod= LinkMovementMethod.getInstance();
        }

        binding.bottomnavigationview.selectedItemId = R.id.bottom_nav_login
        binding.bottomnavigationview.setOnItemSelectedListener{ it ->
            when(it.itemId){
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}