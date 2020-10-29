package com.samelody.samples.kotlin.stdlib

fun main() {
    val pattern = buildString {
        repeat(300) {
            repeat(50) {
                append('o')
            }
            repeat(50) {
                append("x.x")
            }
            appendLine()
        }
    }
    println(pattern)
}