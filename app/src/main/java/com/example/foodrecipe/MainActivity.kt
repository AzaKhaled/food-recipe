package com.example.foodrecipe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var nameedit : TextInputEditText
    lateinit var emailedit : TextInputEditText
    lateinit var passedit: TextInputEditText
    lateinit var loginb: Button
    lateinit var signup: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginb = findViewById(R.id.button)
        signup = findViewById(R.id.textViewSignup)

        loginb.setOnClickListener {
            val myIntent = Intent(this,theardactivity::class.java)
            startActivity(myIntent)
        }
        signup.setOnClickListener {
            val intent = Intent(this,secondeactivity::class.java)
            startActivity(intent)
        }




    }
}