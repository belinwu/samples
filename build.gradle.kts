// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-dev") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlinx") }
        maven { url = uri("https://dl.bintray.com/russhwolf/multiplatform-settings") }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Vers.androidGradlePlugin}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-dev") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlinx") }
        maven { url = uri("https://dl.bintray.com/russhwolf/multiplatform-settings") }
    }
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}