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

        /* the when expression returns the correct resource ID,
         which will be stored in the drawableResource variable*/
        val drawableResource = when (diceOneRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceOneRoll.toString()


    }
}

//set Dice Class
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

