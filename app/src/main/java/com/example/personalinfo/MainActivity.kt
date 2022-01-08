package com.example.personalinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uiEtName = findViewById<EditText>(R.id.uiEtName)
        val uiEtEmail = findViewById<EditText>(R.id. uiEtEmail)
        val uiEtPhoneNumber = findViewById<EditText>(R.id.uiEtPhoneNumber)
        val uiEtPassword= findViewById<EditText>(R.id.uiEtPassword)
        val uiBtn = findViewById<Button>(R.id.uiBtn)


        uiBtn.setOnClickListener {
            var name = uiEtName.text.toString()
            var email =  uiEtEmail.text.toString()
            var phoneNumber = uiEtPhoneNumber.text.toString()
            var password = uiEtPassword.text.toString()

            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("PhoneNumber",phoneNumber)
            intent.putExtra("Password",password)
            startActivity(intent)

        }
    }
}