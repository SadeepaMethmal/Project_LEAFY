package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Page5 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page5)

        val btnLogin: Button = findViewById(R.id.loginBtn)
        val btnCreateAcc: Button = findViewById(R.id.createAccBtn)

        btnLogin.setOnClickListener {
            val intent = Intent(this, Page6::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        btnCreateAcc.setOnClickListener {

            val nameEt = findViewById<EditText>(R.id.textInputEditTextName)
            val emailEt = findViewById<EditText>(R.id.textInputEditTextEmail)
            val pwdEt = findViewById<EditText>(R.id.textInputEditTextPassword)
            val conPwdEt = findViewById<EditText>(R.id.textInputEditTextConfirmPassword)

            val name = nameEt.text?.toString()?.trim().orEmpty()
            val email = emailEt.text?.toString()?.trim().orEmpty()
            val pwd = pwdEt.text?.toString()?.trim().orEmpty()
            val conPwd = conPwdEt.text?.toString()?.trim().orEmpty()
            var valid = true

            val intent = Intent(this, Home::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )

            if(name.isEmpty()){
                nameEt.error = "Name is required"
                valid = false
            }else{
                nameEt.error = null
            }

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

            if (conPwd.isEmpty()) {
                conPwdEt.error = "Password is required"
                valid = false
            } else {
                pwdEt.error = null
            }

            if (valid && pwd != conPwd) {
                conPwdEt.error = "Passwords do not match"
                valid = false
            }

            if (valid){
                startActivity(intent,options.toBundle())
            }

        }

    }
}