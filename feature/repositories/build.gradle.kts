import dependencies.*

plugins {
    plugins.`android-base-library-feature`
}

android {
    namespace = "com.emon.repositories"

}

dependencies {
    addLeakcanaryAndComposeDependencies()
}