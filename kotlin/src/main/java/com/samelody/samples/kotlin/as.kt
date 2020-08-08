package com.samelody.samples.kotlin

fun main() {
    val username = "belinwu"
    val nickname: String? = null
    testCast(username)
    testCast(nickname)
}

fun testCast(name: String?) {
    println("Cast {$name} start")
    try {
        println("as CharSequence: ${name as CharSequence}")
    } catch (e: Exception) {
        println("as CharSequence: ${e.message}")
    }
    println("as CharSequence?: ${name as CharSequence?}")
    println("as? CharSequence: ${name as? CharSequence}")
    println("as? CharSequence?: ${name as? CharSequence?}")

    try {
        println("as Number: ${name as Number}")
    } catch (e: Exception) {
        println("as Number: ${e.message}")
    }
    try {
        println("as Number?: ${name as Number?}")
    } catch (e: Exception) {
        println("as Number?: ${e.message}")
    }
    println("as? Number: ${name as? Number}")
    println("as? Number?: ${name as? Number?}")
    println("Cast {$name} end\n")
}
