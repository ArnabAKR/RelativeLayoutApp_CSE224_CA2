package com.example.relativelayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.inputName)
        val regno = findViewById<EditText>(R.id.inputRegNo)
        val section = findViewById<EditText>(R.id.inputSection)
        val cb1 = findViewById<CheckBox>(R.id.checkBox1)
        val cb2 = findViewById<CheckBox>(R.id.checkBox2)
        val cb3 = findViewById<CheckBox>(R.id.checkBox3)
        val btnsubmit = findViewById<Button>(R.id.button1)
        val btnreset = findViewById<Button>(R.id.button2)
        val out = findViewById<TextView>(R.id.out)
        val radiogrp = findViewById<RadioGroup>(R.id.radiogroup)
        val rb1 = findViewById<RadioButton>(R.id.rb1)
        val rb2 = findViewById<RadioButton>(R.id.rb2)
        val rb3 = findViewById<RadioButton>(R.id.rb3)

        btnsubmit.setOnClickListener {
            if (name.text.toString().isEmpty() || regno.text.toString()
                    .isEmpty() || section.text.toString().isEmpty()||(!(cb1.isChecked || cb2.isChecked || cb3.isChecked))
            ) {

                out.text = "Fill all the details"
                Toast.makeText(applicationContext, "Fill all the details", Toast.LENGTH_SHORT)
                    .show()

            }

            else if (radiogrp.checkedRadioButtonId== -1){
                out.text = "Fill in branch"
                Toast.makeText(applicationContext, "Fill in branch", Toast.LENGTH_SHORT).show()
            }

            else {
                out.text = " "
                Toast.makeText(applicationContext, "Submitted", Toast.LENGTH_LONG).show()
            }
        }

        rb1.setOnClickListener {
            Toast.makeText(applicationContext, "CSE", Toast.LENGTH_SHORT).show()
        }
        rb2.setOnClickListener {
            Toast.makeText(applicationContext, "IT", Toast.LENGTH_SHORT).show()
        }
        rb3.setOnClickListener {
            Toast.makeText(applicationContext, "ECE", Toast.LENGTH_SHORT).show()
        }

        cb1.setOnClickListener {
            Toast.makeText(applicationContext, "Java", Toast.LENGTH_SHORT).show()
        }
        cb2.setOnClickListener {
            Toast.makeText(applicationContext, "C++", Toast.LENGTH_SHORT).show()
        }
        cb3.setOnClickListener {
            Toast.makeText(applicationContext, "Python", Toast.LENGTH_SHORT).show()
        }

        btnreset.setOnClickListener {
            out.text=" "
            radiogrp.clearCheck()
            name.text.clear()
            regno.text.clear()
            section.text.clear()
            cb1.setChecked(false)
            cb2.setChecked(false)
            cb3.setChecked(false)
            Toast.makeText(applicationContext, "All set to reset", Toast.LENGTH_SHORT).show()
        }

    }
}
