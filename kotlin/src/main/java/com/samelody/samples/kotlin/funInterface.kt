package com.samelody.samples.kotlin

fun interface Action {
    fun run()
}

fun callAction(action: Action) {
    action.run()
}

fun callRunnable(action: Runnable) {
    action.run()
}

fun main() {
    callAction {
        println("callAction")
    }
    callRunnable {
        println("callRunnable")
    }
}

