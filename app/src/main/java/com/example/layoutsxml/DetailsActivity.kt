package com.example.layoutsxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layoutsxml.databinding.ActivityDetailsBinding
import kotlinx.android.synthetic.main.activity_details.*

/**
 * For certain history chosen Brainstorm
 */
class DetailsActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerViewAnswers.layoutManager = linearLayoutManager
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val testingAnswers = arrayOf("Odp 7","Odp 6","Odp 5","Odp 4","Odp 3","Odp 2","Odp 1")
        val subject = "Is testing working?"
        binding.brainstormTopic.text = subject
    }
}