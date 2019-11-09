package com.samelody.samples.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() {
    val fruitArray = arrayOf("Apple", "Banana", "Pear", "Grapes", "Strawberry")
    val kotlinChannel = Channel<String>()
    runBlocking {
        launch {
            for (fruit in fruitArray) {
                try {
                    kotlinChannel.send(fruit)
                } catch (e: Exception) {
                    println("Exception raised: ${e.javaClass.simpleName}")
                }
            }
            println("Done!")
        }
        repeat(fruitArray.size - 1) {
            val fruit = kotlinChannel.receive()
            // Conditional close
            if (fruit == "Grapes") {
                // Signal that closure of channel
                kotlinChannel.close()
            }
            println(fruit)
        }
    }
}