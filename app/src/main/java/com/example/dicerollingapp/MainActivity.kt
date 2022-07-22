package com.example.dicerollingapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MyTag", "MainActivity : OnCreate")
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_00_removebg_preview)
        val oneDice: Button = findViewById(R.id.oneDice)
        val twoDice: Button = findViewById(R.id.twoDice)

        oneDice.setOnClickListener {
            val intentOneDice = Intent(this,OneDice::class.java)
            startActivity(intentOneDice)
        }

        twoDice.setOnClickListener {
            val intentOneDice = Intent(this,TwoDice::class.java)
            startActivity(intentOneDice)
        }

    }
}