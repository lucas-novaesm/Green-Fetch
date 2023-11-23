package com.elucas.upxgreenfetch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elucas.upxgreenfetch.databinding.ActivityMainBBinding
import com.elucas.upxgreenfetch.databinding.ActivityMainBinding

class MainActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityMainBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}