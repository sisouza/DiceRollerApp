package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // sets a reference to the Button object in the variable
        val rollButton: Button = findViewById(R.id.btnRoll)
        //function to show message
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        //create a new Dice instance
        val diceOne = Dice(6)
        val diceTwo = Dice(6)

        val diceOneRoll = diceOne.roll()
        val diceTwoRoll = diceTwo.roll()

        val diceImage: ImageView = findViewById(R.id.ivDiceImage)
        //set new dice image in ImageView
        when(diceOneRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

    }
}

//set Dice Class
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

