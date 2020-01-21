package com.samelody.samples.kotlin

fun IntArray?.mergeSorted(other: IntArray?): IntArray? {
    if (this == null || this.isEmpty()) return other
    if (other == null || other.isEmpty()) return this
    var thisIndex = 0
    var otherIndex = 0
    var resultIndex = 0
    val result = IntArray(this.size + other.size)
    while (thisIndex < size && otherIndex < other.size) {
        val thisValue = this[thisIndex]
        val otherValue = other[otherIndex]
        when {
            thisValue == otherValue -> {
                result[resultIndex++] = thisValue
                result[resultIndex++] = otherValue
                thisIndex++
                otherIndex++
            }
            thisValue < otherValue -> {
                result[resultIndex++] = thisValue
                thisIndex++
            }
            else -> {
                result[resultIndex++] = otherValue
                otherIndex++
            }
        }
    }
    while (thisIndex < this.size) result[resultIndex++] = this[thisIndex++]
    while (otherIndex < other.size) result[resultIndex++] = other[otherIndex++]
    return result
}

fun main() {
    "Merge Sorted Arrays" example {
        val a = intArrayOf(3, 4, 5, 7, 10, 15)
        val b = intArrayOf(4, 4, 5, 7, 8, 16, 20)
        a.mergeSorted(b)?.forEach { print("$it ") }
    }
}