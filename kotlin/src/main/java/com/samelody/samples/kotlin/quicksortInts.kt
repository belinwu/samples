package com.samelody.samples.kotlin

fun IntArray.partition(low: Int, high: Int): Int {
    val pivot = this[low]
    var i = low - 1
    var j = high + 1
    while (true) {
        do { j -= 1 } while (this[j] > pivot)
        do { i += 1 } while (this[i] < pivot)
        if (i < j) swapAt(i, j) else return j
    }
}

fun IntArray.quicksort(low: Int, high: Int) {
    if (low >= high) return
    val pivot = partition(low, high)
    quicksort(low, pivot)
    quicksort(pivot + 1, high)
}

fun main() {
    val ints = intArrayOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
    ints.forEach { print("$it ") }
    ints.quicksort(0, ints.size - 1)
    println()
    ints.forEach { print("$it ") }
}