package com.example.leafy

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.leafy.databinding.MyGardenBinding
import com.example.leafy.databinding.ProfileBinding

class Profile : AppCompatActivity() {

    private lateinit var binding: ProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavHelper.handleBottomNav(this, binding.bottomNavigationViewProfile,R.id.profile)

        val backToHomeBtn5: ImageButton = findViewById(R.id.imageButtonProfile)

        backToHomeBtn5.setOnClickListener {
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