package dependencies
import core.Dependencies
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addAndroidxCoreDependencies(){
    androidxCoreDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addAndroidxLifeCycleDependencies(){
    androidxLifeCycleDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addLiveDataDependencies(){
    add("implementation", Dependencies.liveData)
}


/*fun DependencyHandler.addAndroidxNavigationDependencies(){
    androidxNavigationDependencies.forEach {
        add("implementation",it)
    }
}*/

fun DependencyHandler.addCoroutinesAndroidDependencies(){
    coroutinesAndroidDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addNetworkDependencies(configurationName:String = "implementation"){
    networkDependencies.forEach {
        add(configurationName,it)
    }
}

fun DependencyHandler.addHiltDependencies() {
    add("implementation", Dependencies.hiltAndroid)
    add("kapt", Dependencies.hiltCompiler)
}

//fun DependencyHandler.addHiltJetpack() {
//    hiltJetpack.forEach {
//        add("implementation",it)
//    }
//}

fun DependencyHandler.addRxjava3Dependencies(){
    rxjava3Dependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addTimberDependencies(configurationName:String = "implementation"){
    add(configurationName, Dependencies.timber)
}

fun DependencyHandler.addGsonDependencies(configurationName:String = "implementation"){
    add(configurationName, Dependencies.gson)
}

fun DependencyHandler.addAndroidResponsiveSizeDependenciesDependencies(){
    androidResponsiveSizeDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addAlerterDependencies() {
    add("implementation", Dependencies.alerter)
}

fun DependencyHandler.addDotIndicatorDependencies() {
    add("implementation", Dependencies.dotIndicator)
}

fun DependencyHandler.addPicassoDependencies(){
    add("implementation", Dependencies.picasso)
}

fun DependencyHandler.addFirebaseDependencies(){
    firebaseDependencies.forEachIndexed { index, it ->
        when (index) {
            0 -> add("implementation", platform(it))
            else -> add("implementation", it)
        }
    }
}

fun DependencyHandler.addPlayStoreAppUpdateDependencies(){
    playStoreAppUpdateDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addFacebookDependencies(){
    facebookDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addGoogleMapDependencies(){
    googleMapDependencies.forEach {
        add("implementation",it)
    }
}


fun DependencyHandler.addRoomDependencies(){
    add("implementation", Dependencies.room)
    add("implementation", Dependencies.roomRuntime)
    add("kapt", Dependencies.roomCompiler)

}

fun DependencyHandler.addRoomCommonDependencies(){
    add("implementation", Dependencies.roomCommon)
}

fun DependencyHandler.addLeakcanaryAndComposeDependencies(){
    add("debugImplementation", Dependencies.leakcanary)
    add("debugImplementation", Dependencies.composeUiTooling)
    add("debugImplementation", Dependencies.composeTestManifest)
}

fun DependencyHandler.addAndroidTestsDependencies() {
    add("testImplementation", Dependencies.junit)
    add("androidTestImplementation", Dependencies.extJunit)
    add("androidTestImplementation", Dependencies.espresso)
    add("androidTestImplementation", Dependencies.composeTestJunit)
}
