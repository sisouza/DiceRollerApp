package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*

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
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.tvText)
        resultTextView.text = diceRoll.toString()

    }
}

//set Dice Class
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

