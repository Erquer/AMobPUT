package com.example.layoutsxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutsxml.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.fbLoginButton.setOnClickListener {
           println("Hello there, I'm working!")
       }
    }

}