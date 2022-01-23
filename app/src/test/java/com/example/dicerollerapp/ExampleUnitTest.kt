package com.example.dicerollerapp

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generates_number() {
    //create a new instance of Dice for test
        val dice = Dice(6)
        val result = dice.roll()

        assertTrue("result was not a number between 1 and 6", result in 1..6)
    }
}