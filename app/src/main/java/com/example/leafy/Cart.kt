package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.CartBinding
import com.example.leafy.databinding.MyGardenBinding

class Cart : AppCompatActivity() {

    private lateinit var binding: CartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = CartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this,binding.bottomNavigationViewCart,R.id.cart)

        val storeBtn: Button = findViewById(R.id.button8)
        val checkoutBtn: ConstraintLayout = findViewById(R.id.constraintLayout12)
        val cartbackBtn: ImageButton = findViewById(R.id.imageButtonCart)

        storeBtn.setOnClickListener {
            val intent = Intent(this, Page7::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        checkoutBtn.setOnClickListener {
            val intent = Intent(this, PaySuccess::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        cartbackBtn.setOnClickListener {
            val intent = Intent(this, Store::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent, options.toBundle())
        }







    }
}