// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-dev") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlinx") }
        maven { url = uri("https://dl.bintray.com/russhwolf/multiplatform-settings") }
        maven { url = uri("https://jitpack.io") }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Dep.androidGradleVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Dep.kotlinVersion}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-dev") }
        maven { url = uri("http://dl.bintray.com/kotlin/kotlinx") }
        maven { url = uri("https://dl.bintray.com/russhwolf/multiplatform-settings") }
        maven { url = uri("https://jitpack.io") }
    }

    configurations.all {
        resolutionStrategy {
            force(Dep.kotlinStdlib)
            force(Dep.kotlinStdlibJdk8)
            force(Dep.kotlinReflect)
            force(Dep.core)
            force(Dep.appCompat)
            force(Dep.annotation)
            force(Dep.annotationExperimental)
            force(Dep.appCompatResources)
            force(Dep.customView)
            force(Dep.lifecycle)
            force(Dep.lifecycleCommon)
            force(Dep.liveData)
            force(Dep.viewModel)
            force(Dep.loader)
            force(Dep.transition)
            force(Dep.tracing)
            force(Dep.vectorDrawable)
            force(Dep.viewPager2)
            force(Dep.coroutinesCore)
            force(Dep.junit)
        }
    }
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}