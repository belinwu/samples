object Vers {
    const val androidGradlePlugin = "3.2.1"
    const val compileSdk = 28
    const val targetSdk = 28
    const val minSdk = 21
    const val buildTools = "28.0.3"
    const val support = "28.0.0"

    @Deprecated("To be removed")
    const val androidx = "1.0.0"

    const val kotlin = "1.3.0"
    const val lifecycle = "2.0.0"
    const val room = "2.1.0-alpha02"
    const val paging = "2.1.0-beta01"
    const val navigation = "1.0.0-alpha07"
    const val work = "1.0.0-alpha11"
    const val coroutines = "1.0.0"
    const val atomicfu = "0.11.12"
    const val anko = "0.10.7-rc13"
    const val constraint = "2.0.0-alpha2"
    const val junit = "4.12"
    const val glide = "4.8.0"
    const val okhttp = "3.11.0"
    const val retrofit = "2.3.0"
    const val moshi = "1.5.0"
    const val rxkotlin = "2.1.0"
    const val flexbox = "1.1.0"
    const val ktx = "1.0.0"
    const val espresso = "3.1.0-alpha1"
    const val exoplayer = "2.6.0"
    const val arrow = "0.7.3"
    const val databinding = "3.4.0-alpha01"
}

object Deps {
    const val core = "androidx.core:core:1.1.0-alpha01"
    const val core_ktx = "androidx.core:core-ktx:1.0.1"
    const val activity = "androidx.activity:activity:1.0.0-alpha01"
    const val activity_ktx = "androidx.activity:activity-ktx:1.0.0-alpha01"
    const val appcompat = "androidx.appcompat:appcompat:1.0.2"
    const val fragment = "androidx.fragment:fragment:1.1.0-alpha01"
    const val fragment_ktx = "androidx.fragment:fragment-ktx:1.1.0-alpha01"
    const val webkit = "androidx.webkit:webkit:${Vers.androidx}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime:${Vers.lifecycle}"
    const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Vers.lifecycle}"
    const val espresso = "androidx.test.espresso:espresso-core:${Vers.espresso}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel:2.0.0"
    const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
    const val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Vers.lifecycle}"
    const val room = "androidx.room:room-runtime:${Vers.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Vers.room}"
    const val paging = "androidx.paging:paging-runtime:${Vers.paging}"
    const val paging_ktx = "androidx.paging:paging-runtime-ktx:${Vers.paging}"
    const val navigation = "android.arch.navigation:navigation-fragment:${Vers.navigation}"
    const val navigation_ui = "android.arch.navigation:navigation-ui:${Vers.navigation}"
    const val work = "android.arch.work:work-runtime:${Vers.work}"
    const val work_testing = "android.arch.work:work-testing:${Vers.work}"
    const val futures = "androidx.concurrent:concurrent-futures:1.0.0-alpha02"
    const val databinding = "androidx.databinding:databinding-runtime:${Vers.databinding}"
    const val dynamicanimation = "androidx.dynamicanimation:dynamicanimation:${Vers.androidx}"
    const val biometrics = "androidx.biometrics:biometrics:${Vers.androidx}"
    const val collection = "androidx.collection:collection:1.0.0"
    const val collection_ktx = "androidx.collection:collection-ktx:1.0.0"
    const val gridlayout = "androidx.gridlayout:gridlayout:${Vers.androidx}"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
    const val recyclerview_selection = "androidx.recyclerview:recyclerview-selection:1.0.0"
    const val palette = "androidx.palette:palette:${Vers.androidx}"
    const val emoji = "androidx.emoji:emoji:${Vers.androidx}"
    const val media = "androidx.media:media:${Vers.androidx}"
    const val contentpager = "androidx.contentpager:contentpager:${Vers.androidx}"
    const val slice = "androidx.slice:slice-core:${Vers.androidx}"
    const val sliceView = "androidx.slice:slice-view:${Vers.androidx}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Vers.constraint}"
    const val material = "com.google.android.material:material:1.1.0-alpha01"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"
    const val kotlin_scripting = "org.jetbrains.kotlin:kotlin-scripting-jvm:${Vers.kotlin}"
    const val coroutines_jvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.coroutines}"
    const val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Vers.coroutines}"
    const val atomicfu = "org.jetbrains.kotlinx:atomicfu:${Vers.atomicfu}"
    const val kotlinx_metadata_jvm = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.0.4"
    const val preference = "androidx.preference:preference:1.1.0-alpha01"
    const val preference_ktx = "androidx.preference:preference-ktx:1.0.0"
    const val flexbox = "com.google.android:flexbox:1.1.0"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Vers.okhttp}"
    const val glide = "com.github.bumptech.glide:glide:${Vers.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Vers.glide}"
    const val junit = "junit:junit:${Vers.junit}"
    const val ankoCommons = "org.jetbrains.anko:anko-commons:${Vers.anko}"
    const val ankoSqlite = "org.jetbrains.anko:anko-sqlite:${Vers.anko}"
    const val commons_text = "org.apache.commons:commons-text:1.4"
    const val commons_lang = "org.apache.commons:commons-lang3:3.8"
    const val commons_io = "org.apache.commons:commons-io:1.3.2"
    const val commons_collections = "org.apache.commons:commons-collections4:4.2"
    const val commons_csv = "org.apache.commons:commons-csv:1.6"
    const val commons_compress = "org.apache.commons:commons-compress:1.18"
    const val threetenbp = "org.threeten:threetenbp:1.3.6"
    const val threeten_extra = "org.threeten:threeten-extra:1.3.2"
    const val exoplayer = "com.google.android.exoplayer:exoplayer-core:${Vers.exoplayer}"
    const val exoplayer_ui = "com.google.android.exoplayer:exoplayer-ui:${Vers.exoplayer}"
    const val exoplayer_rtmp = "com.google.android.exoplayer:extension-rtmp:${Vers.exoplayer}"
    const val expanding_collection = "com.ramotion.expandingcollection:expanding-collection:0.9.0"
    const val javalin = "io.jaconst valin:jaconst valin:2.0.0"
    const val okio = "com.squareup.okio:okio:2.1.0"
    const val arrow_core = "io.arrow-kt:arrow-core:${Vers.arrow}"
    const val mvrx = "com.airbnb.android:mvrx:0.5.0"
    const val lottie = "com.airbnb.android:lottie:2.6.0"
    const val fotoapparat = "io.fotoapparat:fotoapparat:2.4.0"
    const val truth = "com.google.truth:truth:0.42"
    const val ktor = "io.ktor:ktor-server-core:1.0.0-beta-1"
    const val jsoup = "org.jsoup:jsoup:1.11.3"
    const val groovy = "org.codehaus.groovy:groovy:2.5.2"
    const val mmkv = "com.tencent:mmkv:1.0.10"
    const val vavr = "io.vavr:vavr:0.9.0"
    const val status_bar_compat = "com.githang:status-bar-compat:0.7"
    const val kotlinx_cli = "org.jetbrains.kotlinx:cli:0.1"
    const val multiplatform_settings_common = "com.russhwolf:multiplatform-settings-common:0.1"
    const val multiplatform_settings_android = "com.russhwolf:multiplatform-settings-android:0.1"
    const val multiplatform_settings_ios = "com.russhwolf:multiplatform-settings-ios:0.1"
    const val blurkit = "io.alterac.blurkit:blurkit:1.0.0"
    const val subsampling_imageview = "com.davemorrissey.labs:subsampling-scale-image-view:3.10.0"
}