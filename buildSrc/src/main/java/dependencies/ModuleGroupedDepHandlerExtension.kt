package dependencies
import  core.ModulesDep
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.addDiModule(configurationName:String = "implementation"){
    add(configurationName, project(ModulesDep.di))
}

fun DependencyHandler.addDomainModule(){
    add("implementation", project(ModulesDep.domain))
}

fun DependencyHandler.addDataModule(){
    add("implementation", project(ModulesDep.data))
}
fun DependencyHandler.addRepositoriesModule(){
    add("implementation", project(ModulesDep.repositories))
}
fun DependencyHandler.addProfileModule(){
    add("implementation", project(ModulesDep.profile))
}
fun DependencyHandler.addNavigationModule(){
    add("implementation", project(ModulesDep.navigation))
}

fun DependencyHandler.addSharedPrefModule(configurationName:String = "implementation"){
    add(configurationName, project(ModulesDep.sharedPref))
}


fun DependencyHandler.addApiResponseModule(configurationName:String = "implementation"){
    add(configurationName, project(ModulesDep.apiResponse))
}

fun DependencyHandler.addEntityModule(configurationName:String = "implementation"){
    add(configurationName, project(ModulesDep.entity))
}

fun DependencyHandler.addCommonModule(){
    add("implementation", project(ModulesDep.common))
}

fun DependencyHandler.addAssetsModule(){
    add("implementation", project(ModulesDep.assets))
}


fun DependencyHandler.addCommonFeatureModules(){
   featureCommonModuleDependencies.forEach{
       add("implementation", project(it))
   }
}




fun DependencyHandler.addFeatureModuleDependantDependencies(){
    featureModuleDependantDependencies.forEach{
        add("implementation", project(it))
    }
}


