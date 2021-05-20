package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*findViewById<View>(R.id.cardConstellation).setOnClickListener{
            startActivity(Intent(this, ConstellationActivity::class.java))*/

        val cardConstellation = findViewById<CardView>(R.id.cardConstellation)
        cardConstellation.setOnClickListener{
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))

        }

        findViewById<View>(R.id.cardName).setOnClickListener{
            startActivity(Intent(this, NameActivity::class.java))
        }

    }
}