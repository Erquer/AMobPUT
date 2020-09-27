package com.example.layoutsxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutsxml.databinding.ActivityLoggedBinding


/**
 * Activity shown after logging by User.
 */
class LoggedActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoggedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoggedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewHistoryButton.setOnClickListener {
            startActivity(Intent(this, DetailsActivity::class.java))
        }
    }
}