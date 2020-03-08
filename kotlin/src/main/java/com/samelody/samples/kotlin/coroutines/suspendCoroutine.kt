package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.threadName
import kotlinx.coroutines.*
import kotlinx.coroutines.swing.Swing
import kotlin.coroutines.suspendCoroutine

fun main() {
    val job = GlobalScope.launch {
        println("$threadName: ${coroutineContext[Job]}")
        delay(100)
        GlobalScope.launch(context = Dispatchers.Swing) {
            println("$threadName: ${coroutineContext[Job]}")
        }
        suspendCoroutine<Unit> {
            println("$threadName: ${it.context[Job]}")
        }
    }
    println("$threadName: $job")
    Thread.sleep(3000)
}