package com.elucas.upxgreenfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elucas.upxgreenfetch.databinding.ActivityMainBinding
import com.elucas.upxgreenfetch.databinding.ActivityMainDBinding

class MainActivityD : AppCompatActivity() {
    private lateinit var binding: ActivityMainDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculador()
        home()
    }

    private fun calculador() {
        binding.button6.setOnClickListener {
            val intent = Intent(this, MainActivityE::class.java)
            startActivity(intent)
        }
    }

    private fun home() {
        binding.button11.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}