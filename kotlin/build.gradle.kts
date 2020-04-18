plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Dep.compileSdkVersion)
    buildToolsVersion(Dep.buildToolsVersion)
    defaultConfig {
        minSdkVersion(Dep.minSdkVersion)
        targetSdkVersion(Dep.targetSdkVersion)
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
    implementation(Dep.kotlinStdlib)
    implementation(Dep.coroutinesSwing)
    testImplementation(Dep.junit)
    androidTestImplementation(Dep.testCore)
    androidTestImplementation(Dep.testMonitor)
    androidTestImplementation(Dep.testRunner)
    androidTestImplementation(Dep.testRules)
    androidTestImplementation(Dep.testJunit)
}
