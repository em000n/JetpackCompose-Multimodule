import dependencies.*

plugins {
    plugins.`android-base-library-core`
}

android {
    namespace = "com.emon.domain"

}

dependencies {
    addAndroidxCoreDependencies()
    addCoroutinesAndroidDependencies()
    addEntityModule(configurationName = "api")
    addNetworkDependencies()
}