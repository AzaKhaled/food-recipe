package com.example.foodrecipe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class secondeactivity : AppCompatActivity() {
    lateinit var nameedit : TextInputEditText
    lateinit var emailedit : TextInputEditText
    lateinit var passedit: TextInputEditText
    lateinit var register: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register = findViewById(R.id.button)


        register.setOnClickListener {

            val myIntent = Intent(this,theardactivity::class.java)

            startActivity(myIntent)
        }


    }
}