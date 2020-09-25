package com.example.layoutsxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/**
 * Activity shown after logging by User.
 */
class LoggedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)
    }
}