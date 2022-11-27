package core

internal object Dependencies {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val viewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycleVersion}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val lifecycleService = "androidx.lifecycle:lifecycle-service:${Versions.lifecycleVersion}"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coilCompose}"


//    val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
//    val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
   // const val hiltNavigation = "androidx.hilt:hilt-navigation-fragment:${Versions.hiltNavigationFragmentVersion}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val rxJava3adapter = "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofitVersion}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val okhHttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3Version}"
    const val okhHttp3Interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3Version}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    const val rxJava3 = "io.reactivex.rxjava3:rxjava:${Versions.rxJava3Version}"
    const val rxJava3Android = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid3Version}"

    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"
    const val sdp = "com.intuit.sdp:sdp-android:${Versions.sdpVersion}"
    const val ssp = "com.intuit.ssp:ssp-android:${Versions.sdpVersion}"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanaryVersion}"
    const val dotIndicator = "com.tbuonomo:dotsindicator:${Versions.viewPagerDotIndicatorVersion}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"


    const val playApUpdate = "com.google.android.play:app-update:${Versions.playAppUpdateVersionVersion}"
    const val playApUpdateKtx = "com.google.android.play:app-update-ktx:${Versions.playAppUpdateVersionVersion}"

    const val facebookSdk = "com.facebook.android:facebook-android-sdk:${Versions.facebookVersion}"
    const val facebookMarketing = "com.facebook.android:facebook-marketing:${Versions.facebookMarketingVersion}"

    const val mapSdk = "com.google.android.gms:play-services-maps:${Versions.mapVersion}"
    const val mapLocation = "com.google.android.gms:play-services-location:${Versions.mapLocationVersion}"
    const val mapPlaces = "com.google.android.libraries.places:places:${Versions.mapPlaceVersion}"

    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBomVersion}"
    const val firebaseCore = "com.google.firebase:firebase-core"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"

    const val room = "androidx.room:room-ktx:${Versions.roomVersion}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomCommon = "androidx.room:room-common:${Versions.roomVersion}"



    const val alerter = "com.github.tapadoo:alerter:${Versions.alerter}"

    const val junit = "junit:junit:${Versions.junitVersion}"
    const val extJunit = "androidx.test.ext:junit:${Versions.junitExtVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"

    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"

    const val composeTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"

}