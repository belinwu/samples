package com.samelody.samples.kotlin.algorithms

import com.samelody.samples.kotlin.example
import com.samelody.samples.kotlin.swapAt
import java.util.*

fun <T : Comparable<T>> MutableList<T>.hoarePartition(low: Int, high: Int): Int {
    val pivot = this[low]
    var i = low - 1
    var j = high + 1
    while (true) {
        do { j -= 1 } while (this[j] > pivot)
        do { i += 1 } while (this[i] < pivot)
        if (i < j) swapAt(i, j) else return j
    }
}

fun <T : Comparable<T>> MutableList<T>.hoareQuicksort(low: Int, high: Int) {
    if (low >= high) return
    val pivot = hoarePartition(low, high)
    hoareQuicksort(low, pivot)
    hoareQuicksort(pivot + 1, high)
}

fun <T : Comparable<T>> MutableList<T>.lomutoPartition(low: Int, high: Int): Int {
    val pivot = this[high]
    var i = low
    for (j in low until high) {
        if (this[j] <= pivot) {
            swapAt(i, j)
            i += 1
        }
    }
    swapAt(i, high)
    return i
}

fun <T : Comparable<T>> MutableList<T>.lomutoQuicksort(low: Int, high: Int) {
    if (low >= high) return
    val pivot = lomutoPartition(low, high)
    lomutoQuicksort(low, pivot - 1)
    lomutoQuicksort(pivot + 1, high)
}

fun <T : Comparable<T>> MutableList<T>.lomutoMedian(low: Int, high: Int): Int {
    val mid = (low + high) / 2
    if (this[low] > this[mid]) {
        swapAt(low, mid)
    }
    if (this[low] > this[high]) {
        swapAt(low, high)
    }
    if (this[mid] > this[high]) {
        swapAt(mid, high)
    }
    return mid
}

fun <T : Comparable<T>> MutableList<T>.lomutoMedianQuicksort(low: Int, high: Int) {
    if (low >= high) return
    val median = lomutoMedian(low, high)
    swapAt(median, high)
    val pivot = lomutoPartition(low, high)
    lomutoQuicksort(low, pivot - 1)
    lomutoQuicksort(pivot + 1, high)
}

fun <T : Comparable<T>> MutableList<T>.dutchFlagPartition(
        low: Int,
        high: Int,
        pivotIndex: Int
): Pair<Int, Int> {
    val pivot = this[pivotIndex]
    var smaller = low
    var equal = low
    var larger = high
    while (equal <= larger) {
        when {
            this[equal] < pivot -> {
                swapAt(equal, smaller)
                smaller += 1
                equal += 1
            }
            this[equal] == pivot -> {
                equal += 1
            }
            else -> {
                swapAt(equal, larger)
                larger -= 1
            }
        }
    }
    return smaller to larger
}

fun <T : Comparable<T>> MutableList<T>.dutchFlagQuicksort(low: Int, high: Int) {
    if (low >= high) return
    val middle = dutchFlagPartition(low, high, high)
    dutchFlagQuicksort(low, middle.first - 1)
    dutchFlagQuicksort(middle.second + 1, high)
}

fun<T: Comparable<T>> MutableList<T>.lomutoQuicksortIterative(low: Int, high: Int) {
    val stack = Stack<Int>()
    stack.push(low)
    stack.push(high)
    while (!stack.isEmpty()) {
        val end = stack.pop() ?: continue
        val start = stack.pop() ?: continue
        val p = this.lomutoPartition(start, end)
        if ((p - 1) > start) {
            stack.push(start)
            stack.push(p - 1)
        }
        if ((p + 1) < end) {
            stack.push(p + 1)
            stack.push(end)
        }
    }
}

fun<T: Comparable<T>> MutableList<T>.lomutoQuicksortIterativeUseArray(low: Int, high: Int) {
    val stack = IntArray(high - low + 1)
    var top = -1
    stack[++top] = low
    stack[++top] = high
    while (top >= 0) {
        val end = stack[top--]
        val start = stack[top--]
        val p = lomutoPartition(start, end)
        if ((p - 1) > start) {
            stack[++top] = start
            stack[++top] = p - 1
        }
        if ((p + 1) < end) {
            stack[++top] = p + 1
            stack[++top] = end
        }
    }
}

fun main() {
    "Lomuto Quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println(list)
        list.lomutoQuicksort(0, list.size - 1)
        println(list)
    }

    "Lomuto Quicksort Interatively" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println(list)
        list.lomutoQuicksortIterative(0, list.size - 1)
        println(list)
    }

    "Lomuto Median Quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println(list)
        list.lomutoMedianQuicksort(0, list.size - 1)
        println(list)
    }

    "Hoare Quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println(list)
        list.hoareQuicksort(0, list.size - 1)
        println(list)
    }

    "Dutch Flag Quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println(list)
        list.dutchFlagQuicksort(0, list.size - 1)
        println(list)
    }
}