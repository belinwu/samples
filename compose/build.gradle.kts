
plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Dep.compileSdkVersion)
    buildToolsVersion(Dep.buildToolsVersion)

    defaultConfig {
        applicationId = "com.samelody.samples.compose"
        minSdkVersion(Dep.minSdkVersion)
        targetSdkVersion(Dep.targetSdkVersion)
        versionCode = 1
        versionName = "0.1.0"
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
        jvmTarget = Dep.javaVersion
        freeCompilerArgs = mutableListOf(
                "-Xallow-jvm-ir-dependencies",
                "-Xskip-prerelease-check"
        ).apply {
            addAll(freeCompilerArgs)
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerVersion = Dep.composeCompilerVersion
        kotlinCompilerExtensionVersion = Dep.composeVersion
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Dep.kotlinStdlib)
    implementation(Dep.composeUi)
    implementation(Dep.composeFoundationLayout)
    implementation(Dep.composeMaterial)
    implementation(Dep.composeMaterialIconsExtended)
    implementation(Dep.composeFoundation)
    implementation(Dep.composeAnimation)
    implementation(Dep.composeLiveData)
    implementation(Dep.composeSavedState)
    implementation(Dep.composeDispatch)
    implementation(Dep.composeGeometry)
    implementation(Dep.composeGraphics)
    implementation(Dep.composeFoundationText)
    implementation(Dep.composeText)
    implementation(Dep.composeTextAndroid)
    implementation(Dep.composeUtil)
    implementation(Dep.composeUnit)
    implementation(Dep.composeTooling)
    implementation(Dep.activity)
    implementation(Dep.fragment)
    implementation(Dep.viewModel)
    implementation(Dep.lifecycleProcess)
    implementation(Dep.lifecycleService)
    implementation(Dep.material)
    implementation(Dep.coroutinesAndroid)
    implementation(Dep.constraintLayout)

    testImplementation(Dep.junit)
    testImplementation(Dep.composeTest)
}
