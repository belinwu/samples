package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.threadName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    println(threadName)
    withContext(Dispatchers.Default) {
        println(threadName)
    }
    withContext(Dispatchers.IO) {
        println(threadName)
    }
}
