package com.samelody.samples.kotlin.stdlib

fun main() {
    val s1 = "Belin"
    val s2 = "belin"
    println("s1 = s2 ${s1.equals(s2, ignoreCase = true)}")
}