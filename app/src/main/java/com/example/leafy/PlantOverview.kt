package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.PlantCategoryBinding
import com.example.leafy.databinding.PlantOverviewBinding

class PlantOverview : AppCompatActivity() {

    private lateinit var binding: PlantOverviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = PlantOverviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationViewPlantOverview,R.id.home)

        val backToHomeBtn4: ImageButton = findViewById(R.id.imageButtonPlantOverview)

        backToHomeBtn4.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent,options.toBundle())
        }

    }
}