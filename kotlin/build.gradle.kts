plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Deps.compileSdk)
    buildToolsVersion(Deps.buildTools)
    defaultConfig {
        minSdkVersion(Deps.minSdk)
        targetSdkVersion(Deps.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deps.kotlinStdlib)
    implementation(Deps.coroutinesAndroid)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.testCore)
    androidTestImplementation(Deps.testMonitor)
    androidTestImplementation(Deps.testRunner)
    androidTestImplementation(Deps.testRules)
    androidTestImplementation(Deps.testJunit)
}
