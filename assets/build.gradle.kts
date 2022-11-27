import dependencies.addAndroidxCoreDependencies

plugins {
    plugins.`android-base-library`
}

android {
    namespace = "com.emon.assets"
}

dependencies {
    addAndroidxCoreDependencies()
}