import dependencies.addAndroidxCoreDependencies
import dependencies.addCommonFeatureModules
import dependencies.addFeatureModuleDependantDependencies
import dependencies.addProfileModule

plugins {
    plugins.`android-base-library`
}

android {
    namespace = "com.example.navigation"

}

dependencies {
    addFeatureModuleDependantDependencies()
    addAndroidxCoreDependencies()
    addCommonFeatureModules()
}