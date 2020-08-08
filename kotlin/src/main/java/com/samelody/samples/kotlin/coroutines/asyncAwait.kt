package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.threadName
import kotlinx.coroutines.*
import kotlinx.coroutines.swing.Swing

fun main(): Unit = runBlocking {
    GlobalScope.launch(Dispatchers.Swing) {
        println(threadName)
        val result = async {
            println("async $threadName")
        }
        result.await()
    }
}