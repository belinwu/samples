package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.threadName
import kotlinx.coroutines.*

fun main() {
    (1..10000).forEach {
        GlobalScope.launch {
            println("$it on thread $threadName")
        }
    }
    Thread.sleep(1000)
}