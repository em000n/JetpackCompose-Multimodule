@file:Suppress("UnstableApiUsage", "DEPRECATION")

include(":navigation")


include(":assets")


include(":common")


include(":feature:profile")


include(":feature:repositories")


include(":feature")


include(":model:entity")


include(":model:api-response")

include(":domain")


include(":di")


include(":data")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    gradle.projectsLoaded {
        plugins{
            plugins {
                id ("com.android.application") version(extra.properties["androidGradlePluginVersion"].toString())
                id ("com.android.library") version(extra.properties["androidGradlePluginVersion"].toString())
                id ("org.jetbrains.kotlin.android") version(extra.properties["kotlinVersion"].toString())
                id ("com.google.dagger.hilt.android") version(extra.properties["hiltVersion"].toString())
//                id ("androidx.navigation.safeargs") version(extra.properties["navigationVersion"].toString())

//                val googleServiceVersion:String by settings
//                id ("com.google.gms.google-services") version(googleServiceVersion)

//                val firebaseCrashAnalyticVersion:String by settings
//                id ("com.google.firebase.crashlytics") version(firebaseCrashAnalyticVersion)
//
//                val manesVersion:String by settings
//                id ("com.github.ben-manes.versions") version(manesVersion)

            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Jetpack Compose Multimodule App"
include(":app")
