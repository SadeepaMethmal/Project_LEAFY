package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.HomeBinding
import com.example.leafy.databinding.StoreBinding

class Store : AppCompatActivity() {

    private lateinit var binding: StoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = StoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationViewStore,R.id.cart)

        val cartBtn: ImageButton = findViewById(R.id.btnCart)
        val cartBtn2 = findViewById<TextView>(R.id.textView97)
        val chainsawBtn = findViewById<ImageView>(R.id.imageView55555)

        cartBtn.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        cartBtn2.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        chainsawBtn.setOnClickListener {
            val intent = Intent(this, Page7::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }






    }
}