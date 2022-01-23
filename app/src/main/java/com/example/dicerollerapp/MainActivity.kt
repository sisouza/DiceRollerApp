package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
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
        val diceTwo = Dice(8)

        val diceOneRoll = diceOne.roll()
        val diceTwoRoll = diceTwo.roll()


    }
}

//set Dice Class
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

