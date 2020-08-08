plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Dep.compileSdkVersion)
    buildToolsVersion(Dep.buildToolsVersion)
    defaultConfig {
        applicationId = "com.samelody.samples.dep"
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
    implementation(Dep.kotlinStdlibJdk8)
    implementation(Dep.kotlinReflect)
//    implementation(Deps.kotlinCompiler)
    implementation(Dep.adsId)
    implementation(Dep.adsIdProvider)
    implementation(Dep.annotation)
    implementation(Dep.annotationExperimental)
    implementation(Dep.core)
    implementation(Dep.coreRole)
    implementation(Dep.coreAnimation)
    implementation(Dep.cameraCore)
    implementation(Dep.cameraCamera2)
    implementation(Dep.cameraView)
    implementation(Dep.cameraExtensions)
    implementation(Dep.cameraLifecycle)
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
    implementation(Dep.uiTooling)
    implementation(Dep.gaming)
    implementation(Dep.tracing)
    implementation(Dep.startup)
    implementation(Dep.hilt)
    implementation(Dep.hiltWork)
    implementation(Dep.hiltViewModel)
    implementation(Dep.customView)
    implementation(Dep.activity)
    implementation(Dep.biometric)
    implementation(Dep.browser)
    implementation(Dep.dataBinding)
    implementation(Dep.dataBindingAdapters)
    implementation(Dep.dynamicAnimation)
    implementation(Dep.flexbox)
    implementation(Dep.enterpriseFeedback)
    implementation(Dep.fragment)
    implementation(Dep.fragmentTesting)
    implementation(Dep.loader)
    implementation(Dep.concurrentFutures)
    implementation(Dep.listenableFuture)
    implementation(Dep.listenableFutureCallback)
    implementation(Dep.preference)
    implementation(Dep.viewModel)
    implementation(Dep.viewModelSavedState)
    implementation(Dep.liveData)
    implementation(Dep.recyclerView)
    implementation(Dep.recyclerViewSelection)
    implementation(Dep.lifecycle)
    implementation(Dep.lifecycleProcess)
    implementation(Dep.lifecycleService)
    implementation(Dep.lifecycleJava8)
    implementation(Dep.lifecycleReactiveStreams)
    implementation(Dep.appCompat)
    implementation(Dep.appCompatResources)
    implementation(Dep.autoFill)
    implementation(Dep.emoji)
    implementation(Dep.emojiAppCompat)
    implementation(Dep.emojiBundled)
    implementation(Dep.room)
    implementation(Dep.roomMigration)
    implementation(Dep.sqlite)
    implementation(Dep.shareTarget)
    implementation(Dep.securityCrypto)
    implementation(Dep.versionedParcelable)
    implementation(Dep.paging)
    implementation(Dep.heifWriter)
    implementation(Dep.palette)
    implementation(Dep.recommendation)
    implementation(Dep.material)
    implementation(Dep.coroutinesAndroid)
    implementation(Dep.kotlinIo)
    implementation(Dep.atomicfu)
    implementation(Dep.media)
    implementation(Dep.media2Common)
    implementation(Dep.media2Widget)
    implementation(Dep.media2Session)
    implementation(Dep.media2Player)
    implementation(Dep.media2ExoPlayer)
    implementation(Dep.mediaRouter)
    implementation(Dep.exifInterface)
    implementation(Dep.contentPager)
    implementation(Dep.slice)
    implementation(Dep.sliceView)
    implementation(Dep.sliceBuilders)
    implementation(Dep.multiDex)
    implementation(Dep.savedState)
    implementation(Dep.navigation)
    implementation(Dep.navigationUi)
    implementation(Dep.navigationFragment)
    implementation(Dep.collection)
    implementation(Dep.constraintLayout)
    implementation(Dep.swipeRefreshLayout)
    implementation(Dep.slidingPaneLayout)
    implementation(Dep.drawerLayout)
    implementation(Dep.gridLayout)
    implementation(Dep.cardView)
    implementation(Dep.transition)
    implementation(Dep.textClassifier)
    implementation(Dep.viewPager)
    implementation(Dep.viewPager2)
    implementation(Dep.biometric)
    implementation(Dep.car)
    implementation(Dep.wear)
    implementation(Dep.work)
    implementation(Dep.webkit)
    implementation(Dep.leanback)
    implementation(Dep.leanbackPreference)
    implementation(Dep.localBroadcastManager)
    implementation(Dep.tvProvider)
    implementation(Dep.vectorDrawable)
    implementation(Dep.vectorDrawableAnimated)
    implementation(Dep.vectorDrawableSeekable)
    implementation(Dep.interpolator)
    implementation(Dep.ktorClientCore)
    implementation(Dep.ktorClientCoreJvm)
    implementation(Dep.ktorClientAndroid)
    implementation(Dep.ktorClientOkHttp)
    implementation(Dep.ktorClientJson)
    implementation(Dep.ktorClientGson)
    implementation(Dep.okhttp)
    implementation(Dep.okio)
    implementation(Dep.moshi)
    implementation(Dep.arrowCore)
    implementation(Dep.glide)
    implementation(Dep.photoView)
    implementation(Dep.exoPlayer)
    implementation(Dep.exoPlayerRtmp)
    implementation(Dep.retrofit)
    implementation(Dep.gson)
    implementation(Dep.coordinatorLayout)
    implementation(Dep.zxing)
    implementation(Dep.simpleCropView)
    implementation(Dep.remoteCallback)
    implementation(Dep.eventBus)
    implementation(Dep.gifEncoder)
    implementation(Dep.arCore)
//    implementation(Deps.wcdb)
    implementation(Dep.mmkv)
//    implementation(Deps.halCore)
//    implementation(Deps.halCoreLiveData)
//    implementation(Deps.sceneformCore)
//    implementation(Deps.sceneformUx)
//    implementation(Deps.eiffel)
    implementation(Dep.easyPermissions)
    implementation(Dep.leakCanary)
    implementation(Dep.lottie)
    implementation(Dep.subsamplingImageView)
    implementation(Dep.fresco)
    implementation(Dep.frescoAnimated)
    implementation(Dep.frescoGif)
    implementation(Dep.frescoWebp)
//    implementation(Deps.workflowAndroid)
    implementation(Dep.coil)
    implementation(Dep.coilGif)
//    implementation(Deps.kotlinImmutableCollections)
    implementation(Dep.timber)
    implementation(Dep.imageViewTouch)
//    implementation(Deps.hawk)
//    implementation(Deps.guava)
    implementation(Dep.window)
    implementation(Dep.windowExtensions)
    implementation(Dep.materialDialogsCore)
    implementation(Dep.materialDialogsDateTime)
    implementation(Dep.qmui)
    implementation(Dep.qmuiArch)
    implementation(Dep.materialDrawer)
    implementation(Dep.spyglass)
    implementation(Dep.liTr)
    implementation(Dep.tachyon)
    implementation(Dep.jsonCpp)
    implementation(Dep.poi)

    testImplementation(Dep.benchmark)
    testImplementation(Dep.workTesting)
    testImplementation(Dep.testCore)
    testImplementation(Dep.testMonitor)
    testImplementation(Dep.testRunner)
    testImplementation(Dep.testRules)
    testImplementation(Dep.espresso)
    testImplementation(Dep.junit)
    testImplementation(Dep.coroutinesTest)
    testImplementation(Dep.coroutinesDebug)
}
