package com.example.hallomoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val img = findViewById<ImageView>(R.id.ImageView3)

        btn.setOnClickListener {
            Toast.makeText(this, "Yes!", Toast.LENGTH_SHORT).show()
            Log.v("Naisu","Button was pressed!")
            img.setScaleX(-img.getScaleX())
        }
    }
}