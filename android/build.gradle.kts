plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Dep.compileSdkVersion)
    buildToolsVersion(Dep.buildToolsVersion)
    defaultConfig {
        applicationId = "com.samelody.samples.android"
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dep.kotlinStdlib)
    implementation(Dep.activity)
    implementation(Dep.fragment)
    implementation(Dep.viewModel)
    implementation(Dep.lifecycleProcess)
    implementation(Dep.lifecycleService)
    implementation(Dep.coroutinesAndroid)
    implementation(Dep.constraintLayout)
    testImplementation(Dep.junit)
}
