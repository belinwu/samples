package com.samelody.samples.kotlin

fun IntArray?.mergeSorted(other: IntArray?): IntArray? {
    if (this == null || this.isEmpty()) return other
    if (other == null || other.isEmpty()) return this
    var i = 0
    var j = 0
    var k = 0
    val result = IntArray(this.size + other.size)
    while (i < size && j < other.size) {
        val val1 = this[i]
        val val2 = other[j]
        when {
            val1 == val2 -> {
                result[k++] = val1
                result[k++] = val2
                i++
                j++
            }
            val1 < val2 -> {
                result[k++] = val1
                i++
            }
            else -> {
                result[k++] = val2
                j++
            }
        }
    }
    while (i < this.size) result[k++] = this[i++]
    while (j < other.size) result[k++] = other[j++]
    return result
}

fun main() {
    "Merge Sorted Arrays" example {
        val a = intArrayOf(3, 4, 5, 7, 10, 15)
        val b = intArrayOf(4, 4, 5, 7, 8, 16, 20)
        a.mergeSorted(b)?.forEach { print("$it ") }
    }
}