plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Vers.compileSdk)
    defaultConfig {
        applicationId = "com.samelody.samples.viewmodel"
        minSdkVersion(Vers.minSdk)
        targetSdkVersion(Vers.targetSdk)
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
    implementation(Deps.kotlin)
    implementation(Deps.appcompat)
    implementation(Deps.lifecycle_extensions)
    implementation(Deps.constraint)
    testImplementation(Deps.junit)
}
