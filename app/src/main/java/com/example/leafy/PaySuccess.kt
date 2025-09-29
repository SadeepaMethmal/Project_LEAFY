package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.PaySuccessBinding

class PaySuccess : AppCompatActivity() {

    private lateinit var binding: PaySuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = PaySuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this,binding.bottomNavigationViewPaySuccess,R.id.cart)

        val backToStoreBtn1: ImageButton = findViewById(R.id.imageButtonPaySuccess)
        val receiptBtn: Button = findViewById(R.id.recieptBtn)
        val doneBtn: Button = findViewById(R.id.doneBtn)

        backToStoreBtn1.setOnClickListener {
            val intent = Intent(this, Store::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }

        receiptBtn.setOnClickListener {
            val intent = Intent(this, Store::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }

        doneBtn.setOnClickListener {
            val intent = Intent(this, Store::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }

    }
}