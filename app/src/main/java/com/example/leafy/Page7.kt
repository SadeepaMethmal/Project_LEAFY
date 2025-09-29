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
import com.example.leafy.databinding.Page7Binding

class Page7 : AppCompatActivity() {

    private lateinit var binding: Page7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = Page7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationView2,R.id.cart)

        val btnAddToCart: Button = findViewById(R.id.addCartBtn)
        val backToStoreBtn: ImageButton = findViewById(R.id.imageButton2)
        val backToCartBtn: ImageButton = findViewById(R.id.imageButton5)

        btnAddToCart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent,options.toBundle())
        }

        backToStoreBtn.setOnClickListener {
            val intent = Intent(this, Store::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }

        backToCartBtn.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }


    }
}