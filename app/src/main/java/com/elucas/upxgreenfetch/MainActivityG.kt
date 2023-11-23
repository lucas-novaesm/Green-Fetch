package com.elucas.upxgreenfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elucas.upxgreenfetch.databinding.ActivityMainBinding
import com.elucas.upxgreenfetch.databinding.ActivityMainEBinding
import com.elucas.upxgreenfetch.databinding.ActivityMainGBinding

class MainActivityG : AppCompatActivity() {
    private lateinit var binding: ActivityMainGBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainGBinding.inflate(layoutInflater)
        setContentView(binding.root)

        home()
        calculador()
    }
    private fun home() {
        binding.button9.setOnClickListener {
            val intent = Intent(this, MainActivityD::class.java)
            startActivity(intent)
        }
    }

    private fun calculador() {
        binding.button10.setOnClickListener {
            val intent = Intent(this, MainActivityE::class.java)
            startActivity(intent)
        }
    }
}