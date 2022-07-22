package com.example.dicerollingapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class OneDice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_dice)

        Log.i("MyTag", "OneDice : OnCreate")

        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
        val roll: Button = findViewById(R.id.roll)

        //For running a sound we have to create a variable of MediaPlayer class and then run create function and give
        //the address of where the sound file is.
        val mp: MediaPlayer = MediaPlayer.create(this, R.raw.sound_0)



        roll.setOnClickListener {
            Log.i("MyTag", "Roll Clicked")

//            if (!mp.isPlaying) {//if mp is not playing . It will play the sound. However it doesnt have the ability to play
//                                //the sound from start again unless the old sound is not yet finished.
            mp.start()
//            }

            val dice = DiceRoll(6)
            val randNum = dice.roll()

            Log.i("MyTag", "Its a $randNum")

            when (randNum) {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }
            diceImage.contentDescription = randNum.toString()
        }

//        if (mp.isPlaying) { //If mp is playing it will close it each time after button is pressed.
//            mp.stop()
//        }


    }

    class DiceRoll(val sides: Int) {

        fun roll(): Int {
            return (1..sides).random()
        }
    }
}