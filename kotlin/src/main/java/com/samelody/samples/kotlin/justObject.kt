package com.samelody.samples.kotlin

fun main() {
    val obj = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(obj.x + obj.y)
}