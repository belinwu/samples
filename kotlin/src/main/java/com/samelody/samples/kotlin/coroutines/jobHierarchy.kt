package com.samelody.samples.kotlin.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    with(GlobalScope) {
        val parent = launch {
            println("I’m the parent")
//            delay(200)
        }
        val child = launch(context = parent) {
            println("I’m a child")
        }
        Thread.sleep(1000)
    }
}