package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page6)

        val btnLogin2: Button = findViewById(R.id.createAccBtn)

        btnLogin2.setOnClickListener {

            val emailEt = findViewById<EditText>(R.id.textInputEditTextEmail)
            val pwdEt = findViewById<EditText>(R.id.textInputEditTextPassword)

            val email = emailEt.text?.toString()?.trim().orEmpty()
            val pwd = pwdEt.text?.toString()?.trim().orEmpty()
            var valid = true

            val intent = Intent(this, Home::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )

            if(email.isEmpty()){
                emailEt.error = "Email is required"
                valid = false
            }else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                emailEt.error = "Enter a valid email"
                valid = false
            }else{
                emailEt.error = null
            }

            if (pwd.isEmpty()) {
                pwdEt.error = "Password is required"
                valid = false
            } else {
                pwdEt.error = null
            }

            if (valid){
                startActivity(intent,options.toBundle())
            }
        }
    }
}