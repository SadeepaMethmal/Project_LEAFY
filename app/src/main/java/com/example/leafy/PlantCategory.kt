package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.MyGardenBinding
import com.example.leafy.databinding.PlantCategoryBinding

class PlantCategory : AppCompatActivity() {

    private lateinit var binding: PlantCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = PlantCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationViewPlantCategory,R.id.home)

        val backToHomeBtn2: ImageButton = findViewById(R.id.imageButtonPlantCategory)


        backToHomeBtn2.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }

        val mintBtn = findViewById<ImageView>(R.id.imageView22)
        mintBtn.setOnClickListener {
            val intent = Intent(this, PlantOverview::class.java)
            startActivity(intent,)
        }


    }
}