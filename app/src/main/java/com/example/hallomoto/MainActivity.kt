package com.example.hallomoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
<<<<<<< HEAD
import android.view.View
=======
>>>>>>> 9e17e68 (Learned `img.setScaleX(-img.getScaleX())`, which is what we were going for in the first place, and the value of taking a mid-day nap.)
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val img = findViewById<ImageView>(R.id.ImageView3)
<<<<<<< HEAD
        val imj = findViewById<ImageView>(R.id.ImageView4)
        val vis = true;
        imj.setVisibility(View.INVISIBLE)
        btn.setOnClickListener {
            Toast.makeText(this, "Yes!", Toast.LENGTH_SHORT).show()
            Log.v("Naisu","Button was pressed!")

            if (vis) {
                img.setVisibility(View.INVISIBLE)
                imj.setVisibility(View.VISIBLE)
            }
            else {
                img.setVisibility(View.VISIBLE)
                imj.setVisibility(View.INVISIBLE)
            }
            // Emulator is laggy enough that I literally can't tell if the image isn't appearing because I did something wrong, or due to the lag.
        }
        //img.setScaleType(-img.getScaleType()
=======

        btn.setOnClickListener {
            Toast.makeText(this, "Yes!", Toast.LENGTH_SHORT).show()
            Log.v("Naisu","Button was pressed!")
            img.setScaleX(-img.getScaleX())
        }
>>>>>>> 9e17e68 (Learned `img.setScaleX(-img.getScaleX())`, which is what we were going for in the first place, and the value of taking a mid-day nap.)
    }
}