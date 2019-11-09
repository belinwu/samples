package com.samelody.samples.kotlin

import kotlinx.coroutines.*
import java.util.concurrent.*

fun main() {
    // 1
    val queue = LinkedBlockingQueue<Int>()
    runBlocking {
        // 2
        launch {
            (1..5).forEach {
                queue.put(it)
//                yield()
                println("Produced ${it}")
            }
        }
        // 3
        launch {
            while (true) {
                println("Consumed ${queue.take()}")
//                yield()
            }
        }
        println("Done!")
    }
}