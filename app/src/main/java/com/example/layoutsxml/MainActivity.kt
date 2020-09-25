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
        binding.calculateButton.setOnClickListener {
            calculateTip()
        }
    }
    private fun calculateTip(){
        val stringInTextField:String = binding.costOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null) {
        binding.tipResult.text = ""
        return
        }
        val tipPrecentage = when(binding.tipOptions.checkedRadioButtonId){
            R.id.twenty_procent -> 0.20
            R.id.eighteen_procent -> 0.18
            else -> 0.15
        }

        var tip = tipPrecentage * cost
        val roundUp = binding.roundUpSwitch.isChecked
        if(roundUp){
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}