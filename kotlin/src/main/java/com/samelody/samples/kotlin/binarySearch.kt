package com.samelody.samples.kotlin


fun IntArray?.binarySearch(value: Int): Int {
    if (this == null || isEmpty()) return -1
    var low = 0
    var high = size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        val midValue = this[mid]
        when {
            midValue < value -> {
                low = mid + 1
            }
            midValue == value -> {
                return mid
            }
            else -> {
                high = mid - 1
            }
        }
    }
    return -1
}

fun main() {
    "Binary Search" example {
        val ints = intArrayOf(21, 32, 43, 74, 75, 86, 97, 108, 149)
        println("index of 43 is ${ints.binarySearch(43)}")
    }
}