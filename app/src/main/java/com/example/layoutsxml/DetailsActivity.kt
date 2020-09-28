package com.example.layoutsxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layoutsxml.adapter.BrainStormAdapter
import com.example.layoutsxml.data.Datasource
import com.example.layoutsxml.databinding.ActivityDetailsBinding
import kotlinx.android.synthetic.main.activity_details.*

/**
 * For certain history chosen Brainstorm
 */
class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val dataSet = Datasource().loadBrainStorms()
        val subject = "Is testing working?"
        binding.brainstormTopic.text = subject
        binding.recyclerViewAnswers.adapter = BrainStormAdapter(this, dataSet)
        binding.recyclerViewAnswers.setHasFixedSize(true)
    }
}