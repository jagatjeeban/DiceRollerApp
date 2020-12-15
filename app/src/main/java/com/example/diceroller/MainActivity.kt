package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollDice(view: View) {
        val randomInt = (1..6).random()


        val rollButton: Button = findViewById(R.id.roll_button)

        Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        if (randomInt == 6) {
            resultText.text = "Congrats!"
        } else {
            resultText.text = ""
        }


        val diceImage: ImageView = findViewById(R.id.dice_image)


        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }
}