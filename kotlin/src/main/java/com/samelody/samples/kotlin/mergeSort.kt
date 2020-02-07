package com.samelody.samples.kotlin

fun IntArray.mergeSort(low: Int, high: Int) {
    if (low >= high) return
    val mid = (low + high) / 2
    mergeSort(low, mid)
    mergeSort(mid + 1, high)
    merge(low, mid, high)
}

fun IntArray.merge(low: Int, mid: Int, high: Int) {
    val n1 = mid - low + 1
    val n2 = high - mid
    val a1 = IntArray(n1)
    val a2 = IntArray(n2)

    for (i in 0 until n1) a1[i] = this[low + i]
    for (j in 0 until n2) a2[j] = this[mid + 1 + j]

    var i = 0
    var j = 0
    var k = low
    while (i < n1 && j < n2) {
        this[k++] = if (a1[i] <= a2[j]) a1[i++] else a2[j++]
    }

    while (i < n1) this[k++] = a1[i++]
    while (j < n2) this[k++] = a2[j++]
}

fun main() {
    "Merge Sort" example {
        val array = intArrayOf(12, 0, 3, 9, 2, 21, 2, 18, 27, 1, 5, 8, -1, 8)
        array.run {
            forEach { print("$it ") }
            mergeSort(0, size - 1)
            println()
            forEach { print("$it ") }
        }
    }
}