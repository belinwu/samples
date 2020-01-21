package com.samelody.samples.kotlin

infix fun String.example(block: () -> Unit) {
    println("---Example of $this---")
    block()
    println()
}

fun <T> MutableList<T>.swapAt(first: Int, second: Int) {
    val temp = this[first]
    this[first] = this[second]
    this[second] = temp
}

fun IntArray.swapAt(first: Int, second: Int) {
    val temp = this[first]
    this[first] = this[second]
    this[second] = temp
}