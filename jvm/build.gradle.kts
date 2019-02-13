plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation(Deps.kotlin_stdlib)
    implementation(Deps.coroutines_jvm)
    implementation(Deps.atomicfu)
}

