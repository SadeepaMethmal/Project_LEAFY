package com.example.leafy

import android.app.Activity
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

object NavHelper {

    fun handleBottomNav(
        activity: Activity,
        bottomNav: BottomNavigationView,
        currentId: Int
    ) {
        // mark current tab selected
        bottomNav.selectedItemId = currentId

        bottomNav.setOnItemSelectedListener { item ->
            if (item.itemId == currentId) return@setOnItemSelectedListener true

            val intent = when (item.itemId) {
                R.id.home      -> Intent(activity, Home::class.java)
                R.id.cart      -> Intent(activity, Store::class.java)
                R.id.my_garden -> Intent(activity, MyGarden::class.java)
                R.id.profile   -> Intent(activity, Profile::class.java)
                else -> null
            } ?: return@setOnItemSelectedListener false

            // bring existing instance to front (no flicker)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            activity.startActivity(intent)
            activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            activity.finish() // remove old tab from back stack
            true
        }
    }
}