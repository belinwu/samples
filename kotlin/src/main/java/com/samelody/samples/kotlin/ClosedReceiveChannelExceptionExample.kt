package com.samelody.samples.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() {
    val fruitArray = arrayOf("Apple", "Banana", "Pear", "Grapes", "Strawberry")
    val kotlinChannel = Channel<String>()

    runBlocking {
        launch {
            for (fruit in fruitArray) {
                // Conditional close
                if (fruit == "Grapes") {
                    // Signal that closure of channel
                    kotlinChannel.close()
                    break
                }
                kotlinChannel.send(fruit)
            }
        }
        repeat(fruitArray.size) {
            try {
                val fruit = kotlinChannel.receive()
                println(fruit)
            } catch (e: Exception) {
                println("Exception raised: ${e.javaClass.simpleName}")
            }
        }
        println("Done!")
    }
}