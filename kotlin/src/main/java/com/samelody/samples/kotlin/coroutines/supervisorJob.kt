package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.threadName
import kotlinx.coroutines.*

fun main() {
    val context = SupervisorJob()
    println("context=$context, job=${context[Job]}")
    val coroutineScope = CoroutineScope(context)
    val job = coroutineScope.launch(Dispatchers.IO) {
        if (isActive)
        println(threadName)
    }
    coroutineScope.cancel()
    println(job)
}