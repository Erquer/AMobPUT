package com.example.layoutsxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.layoutsxml.databinding.ActivityMainBinding
import java.text.NumberFormat

/**
 * First Activity - main screen
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.fbLoginButton.setOnClickListener {
           val intent = Intent(this,CodePopUp::class.java)
           intent.putExtra("popuptitle", "Login")
           intent.putExtra("popuptext", "Great, you're logged in!")
           intent.putExtra("popupbtn", "OK")
           intent.putExtra("darkstatusbar", false)
           startActivity(intent)
       }

        binding.joinStormButton.setOnClickListener {
            val intent = Intent(this,CodePopUp::class.java)
            intent.putExtra("popuptitle", "Joining")
            intent.putExtra("popuptext", "Great, You have joined the BrainStorm!")
            intent.putExtra("popupbtn", "OK")
            intent.putExtra("darkstatusbar", false)
            startActivity(intent)
        }
    }

}