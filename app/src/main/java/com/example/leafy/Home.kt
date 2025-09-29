package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.HomeBinding
import com.example.leafy.databinding.MyGardenBinding

class Home : AppCompatActivity() {

    private lateinit var binding: HomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = HomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationViewHome,R.id.home)

        val mintBtn:  Button = findViewById(R.id.buttonMint)
        val herbBtn: Button = findViewById(R.id.buttonHerbs)
        val nutrientBtn: Button = findViewById(R.id.buttonNutrients)

        mintBtn.setOnClickListener {
            val intent = Intent(this, PlantOverview::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        herbBtn.setOnClickListener {
            val intent = Intent(this, PlantCategory::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }

        nutrientBtn.setOnClickListener {
            val intent = Intent(this,Page11::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }



    }
}