package com.samelody.samples.kotlin.lang

object Util {
    fun isHttpUrl(str: String): Boolean {
        return str.startsWith("https") || str.startsWith("http")
    }

    @JvmStatic
    fun isFileUrl(str: String): Boolean = str.startsWith("file")
}