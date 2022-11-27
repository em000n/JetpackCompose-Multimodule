package dependencies
import core.ModulesDep

internal val featureCommonModuleDependencies = listOf(
    ModulesDep.repositories,
    ModulesDep.profile
)



internal val featureModuleDependantDependencies = listOf(
    ModulesDep.di,
    ModulesDep.domain,
    ModulesDep.assets,
    ModulesDep.common
)





