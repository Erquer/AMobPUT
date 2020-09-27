package com.example.layoutsxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.core.view.get
import com.example.layoutsxml.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_code_pop_up.*
import kotlinx.android.synthetic.main.activity_code_pop_up.view.*
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
           val intent2 = Intent(this, LoggedActivity::class.java)
           startActivity(intent2)
       }

        binding.joinStormButton.setOnClickListener {
          val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_code_pop_up, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("Code Form")

            val mAlertDialog = mBuilder.show()

            val array = arrayOf("Brainstorm 1","Brainstorm 2","Brainstorm 3","Brainstorm 4","Brainstorm 5")
            mAlertDialog.brainstorm_spinner.adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, array)
            mDialogView.pass_code_btn.setOnClickListener {
                mAlertDialog.dismiss()
                val brainStormName = mDialogView.brainstorm_spinner.selectedItem.toString()
                val code = mDialogView.codeEt.text.toString()
                when(code){
                    // check if code match to chosen brainstorm.
                    "12345" -> startActivity(Intent(this, VotingActicity::class.java))
                    else -> AlertDialog.Builder(this).setMessage("Wrong Code").setTitle("Code Form").show()
                }
            }
            mDialogView.cancel_code_btn.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
    }

}