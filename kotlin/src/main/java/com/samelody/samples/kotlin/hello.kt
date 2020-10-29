package com.samelody.samples.kotlin

@ExperimentalStdlibApi
fun main() {
    val names = buildMap<String, String> {
        this["first_name"] = "Belin"
        this["last_name"] = "Wu"
    }
    for ((first, last) in names) {
        println("first=$first, last=$last")
    }
    println("Hello world!")
}