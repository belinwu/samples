plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Vers.compileSdk)
    defaultConfig {
        applicationId = "com.samelody.samples.dep"
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
    implementation(Deps.core)
    implementation(Deps.core_ktx)
    implementation(Deps.activity)
    implementation(Deps.activity_ktx)
    implementation(Deps.fragment)
    implementation(Deps.fragment_ktx)
    implementation(Deps.preference)
    implementation(Deps.preference_ktx)
    implementation(Deps.viewmodel_ktx)
    implementation(Deps.recyclerview)
    implementation(Deps.recyclerview_selection)
    implementation(Deps.lifecycle)
    implementation(Deps.appcompat)
    implementation(Deps.room)
    implementation(Deps.sqlite_ktx)
    implementation(Deps.paging)
    implementation(Deps.paging_ktx)
    implementation(Deps.palette)
    implementation(Deps.palette_ktx)
    implementation(Deps.material)
    implementation(Deps.coroutines_android)
    implementation(Deps.atomicfu)
    implementation(Deps.media)
    implementation(Deps.mediarouter)
    implementation(Deps.contentpager)
    implementation(Deps.collection)
    implementation(Deps.collection_ktx)
    implementation(Deps.constraintlayout)
    implementation(Deps.swiperefreshlayout)
    implementation(Deps.slidingpanelayout)
    implementation(Deps.drawerlayout)
    implementation(Deps.cardview)
    implementation(Deps.transition)
    implementation(Deps.textclassifier)
    implementation(Deps.viewpager)
    implementation(Deps.localbroadcastmanager)
    implementation(Deps.vectordrawable)
    implementation(Deps.vectordrawable_animated)
    implementation(Deps.interpolator)
    implementation(Deps.ktor_client_android)
    implementation(Deps.ktor_client_okhttp)
    implementation(Deps.okio)
    implementation(Deps.glide)
    implementation(Deps.exoplayer)
    implementation(Deps.exoplayer_rtmp)
    implementation(Deps.retrofit)
    implementation(Deps.gson)
    implementation(Deps.coordinatorlayout)
    implementation(Deps.simplecropview)
    implementation(Deps.remotecallback)
    testImplementation(Deps.junit)
}
