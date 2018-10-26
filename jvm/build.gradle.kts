plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation(Deps.kotlin)
    implementation(Deps.coroutines_jvm)
    implementation(Deps.atomicfu)
}

