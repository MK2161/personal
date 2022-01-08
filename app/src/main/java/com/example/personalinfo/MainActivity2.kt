package com.example.personalinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val name = intent.getStringExtra("Name")
        val email= intent.getStringExtra("Email")
        val phoneNumber = intent.getStringExtra("PhoneNumber")
        val password = intent.getStringExtra("Password")

        val uiTvResult = findViewById<TextView>(R.id.uiTvResult)

        uiTvResult.text = "Name: "+name+"\nEmail: "+email+"\nPhoneNumber: "+phoneNumber+"\nPassword: "+password




    }
}