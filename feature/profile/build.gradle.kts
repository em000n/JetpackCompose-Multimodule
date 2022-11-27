import dependencies.*

plugins {
    plugins.`android-base-library-feature`
}

android {
    namespace = "com.emon.profile"

}

dependencies {

    addLeakcanaryAndComposeDependencies()
   
}