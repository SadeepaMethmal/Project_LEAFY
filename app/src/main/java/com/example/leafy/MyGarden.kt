package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.MyGardenBinding
import com.example.leafy.databinding.Page11Binding

class MyGarden : AppCompatActivity() {

    private lateinit var binding: MyGardenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = MyGardenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationViewGarden,R.id.my_garden)

        val addFirstPlantBtn: Button = findViewById(R.id.button4)
        val addPlantBtn: Button = findViewById(R.id.button3)

        addFirstPlantBtn.setOnClickListener {
            val intent = Intent(this, PlantCategory::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent, options.toBundle())
        }

        addPlantBtn.setOnClickListener {
            val intent = Intent(this, PlantCategory::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in,
                R.anim.fade_out
            )
            startActivity(intent, options.toBundle())
        }



    }
}