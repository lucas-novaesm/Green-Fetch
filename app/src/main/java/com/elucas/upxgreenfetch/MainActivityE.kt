package com.elucas.upxgreenfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elucas.upxgreenfetch.databinding.ActivityMainDBinding
import com.elucas.upxgreenfetch.databinding.ActivityMainEBinding

class MainActivityE : AppCompatActivity() {
    private lateinit var binding: ActivityMainEBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainEBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pedido()
    }

    private fun pedido() {
        binding.button7.setOnClickListener {
            val intent = Intent(this, MainActivityG::class.java)
            startActivity(intent)
        }
    }
}