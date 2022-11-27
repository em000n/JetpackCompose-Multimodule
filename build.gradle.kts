buildscript {
 val compose_version by extra("1.3.0")
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") apply (false)
    id ("com.android.library") apply (false)
    id ("org.jetbrains.kotlin.android") apply (false)
    id ("org.jetbrains.kotlin.jvm") apply (false)
    id ("com.google.dagger.hilt.android") apply(false)
    id ("androidx.navigation.safeargs") apply(false)
}
tasks.create<Delete>("clean") {
    delete  = setOf(
        rootProject.buildDir
    )
}

fun String.isNonStable(): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(this)
    return isStable.not()
}


gradle.projectsLoaded{
    configurations.all {
        configurations.all {
            resolutionStrategy {
                eachDependency {
                    if ((requested.group == "org.jetbrains.kotlin") && (!requested.name.startsWith("kotlin-gradle"))) {
                        useVersion(extra.properties["kotlinVersion"].toString())
                    }
                }
                force(
                    "org.jetbrains.kotlin:kotlin-stdlib:${extra.properties["kotlinVersion"].toString()}",
                    "org.jetbrains.kotlin:kotlin-stdlib-common:${extra.properties["kotlinVersion"].toString()}",
                    "org.jetbrains.kotlin:kotlin-reflect:${extra.properties["kotlinVersion"].toString()}",
                )
            }
        }
    }
}