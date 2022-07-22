package com.example.dicerollingapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun genereates_number(){ //So here we created a test to check if the roll method of the DiceRoll class returns
                            // number between 1 to 6 or not.
        val dice = OneDice.DiceRoll(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
        //the above message will be displayed if the condition is not satisfied else it will not be displayed.

    }
}