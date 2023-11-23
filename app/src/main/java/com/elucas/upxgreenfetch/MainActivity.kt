package com.elucas.upxgreenfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elucas.upxgreenfetch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cadastro()
        recuperarSenha()
        home()
        sobre()
    }

    private fun cadastro() {
        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivityB::class.java)
            startActivity(intent)
        }
    }

    private fun recuperarSenha() {
        binding.button4.setOnClickListener {
            val intent = Intent(this, MainActivityC::class.java)
            startActivity(intent)
        }
    }

    private fun home() {
        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivityD::class.java)
            startActivity(intent)
        }
    }
    private fun sobre() {
        binding.button8.setOnClickListener {
            val intent = Intent(this, MainActivityF::class.java)
            startActivity(intent)
        }
    }
}