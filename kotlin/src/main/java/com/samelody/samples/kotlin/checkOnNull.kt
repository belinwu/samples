package com.samelody.samples.kotlin

import java.io.File

fun main() {
    val zipFile: File? = newZipFile()
    if (zipFile?.exists() == true) zipFile.delete()
}

fun newZipFile(): File? {
    return null
}
