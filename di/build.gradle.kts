import dependencies.*

plugins {
    plugins.`android-base-library-core`
}

android {
    namespace = "com.emon.di"

}

dependencies {
    addNetworkDependencies()
    addTimberDependencies(configurationName = "api")
}
