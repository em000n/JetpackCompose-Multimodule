import dependencies.*

plugins {
    plugins.`android-base-library-core`
}

android {
    namespace = "com.emon.data"
}

dependencies {
    addNetworkDependencies(configurationName = "api")
    addDiModule(configurationName = "api")
    addApiResponseModule(configurationName = "api")
    addDomainModule()
    addCoroutinesAndroidDependencies()
    addRxjava3Dependencies()
}