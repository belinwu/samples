package com.samelody.samples.kotlin

import kotlinx.coroutines.*

fun main() {
    (1..10000).forEach {
        GlobalScope.launch {
            val name = Thread.currentThread().name
            println("$it on thread $name")
        }
    }
    Thread.sleep(1000)
}