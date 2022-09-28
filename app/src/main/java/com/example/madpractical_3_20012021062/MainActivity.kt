package com.example.madpractical_3_20012021062

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.madpractical_3_20012021062.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.bottomnavigationview.setOnItemSelectedListener{ it ->
            when(it.itemId){
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also {startActivity(it)}
                }

                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java). also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }


    }
}