package com.elucas.upxgreenfetch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elucas.upxgreenfetch.databinding.ActivityMainBBinding
import com.elucas.upxgreenfetch.databinding.ActivityMainCBinding

class MainActivityC : AppCompatActivity() {
    private lateinit var binding: ActivityMainCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}