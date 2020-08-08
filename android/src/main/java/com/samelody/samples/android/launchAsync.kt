package com.samelody.samples.android

import kotlinx.coroutines.*

fun launchAsync() {
    GlobalScope.launch(Dispatchers.Main) {
        println(threadName)
        val result = async {
            println("async $threadName")
        }
        result.await()
    }
}