package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.threadName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    var isDoorOpen = false
    println("[$threadName]Unlocking the door... please wait.")
    GlobalScope.launch {
        delay(3000)
        println("[$threadName]The door open now.")
        isDoorOpen = true
    }
    GlobalScope.launch {
        repeat(4) {
            println("[$threadName]Trying to open the door...")
            delay(800)
            if (isDoorOpen) {
                println("[$threadName]Opened the door!")
            } else {
                println("[$threadName]The door is still locked")
            }
        }
    }
    Thread.sleep(5000)
}