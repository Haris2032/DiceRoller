package com.mohammedharis2032.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.mohammedharis2032.diceroller.R.id.Roll_Button
import kotlin.random.*
import android.view.animation.Animation.AnimationListener as AnimationListener1
import android.view.animation.Animation.AnimationListener as AnimationAnimationListener

class MainActivity : AppCompatActivity() {

    lateinit var Dice_image :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var roll_button : Button = findViewById(Roll_Button)

        roll_button.setOnClickListener {
             rollDice()
        }

        Dice_image = findViewById(R.id.Dice)
    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6)+ 1

        val imageResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
        }

        Dice_image.setImageResource(imageResource)

    }
}
