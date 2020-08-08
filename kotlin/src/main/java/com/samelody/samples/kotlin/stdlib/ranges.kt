package com.samelody.samples.kotlin.stdlib

fun main() {
//    for (letter in 'Z' downTo 'A') print(letter)
//    val intArray = intArrayOf(1, 2, 3, 4)
//    for (i in intArray.indices) print(i)
    testUntil()

    val i = arrayOf(1)
    println(i.iterator())
    println(i.iterator())
}

private fun testReversed() {
    val daysOfYear: IntRange = 1..365
    for(day in daysOfYear.reversed()) {
        println("Remaining days: $day")
    }
}

private fun testUntil() {
    (0 until 10).forEach { print("$it ") }
}