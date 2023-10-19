package com.example.myhandsonapplication

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {
    @Test
    fun testExample() {
        assertTrue(Greeting().greet().contains("Helloあああ"), "Check 'Hello' is mentioned")
    }
}
