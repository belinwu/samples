package com.samelody.samples.kotlin.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() {
    val fruitArray = arrayOf("Apple", "Banana", "Pear", "Grapes", "Strawberry")
    val kotlinChannel = Channel<String>()
    runBlocking {
        launch {
            for (fruit in fruitArray) {
                if (fruit == "Pear") {
                    break
                }
                kotlinChannel.send(fruit)
                println("Sent: $fruit")
            }
        }
        launch {
            repeat(fruitArray.size) {
                val fruit = kotlinChannel.poll()
                if (fruit != null) {
                    println("Received: $fruit")
                } else {
                    println("Channel is empty")
                }
                delay(500)
            }
            println("Done!")
        }
    }
}