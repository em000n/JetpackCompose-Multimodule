package dependencies
import core.Dependencies

internal val androidxCoreDependencies = listOf(
    Dependencies.appcompat,
    Dependencies.coilCompose,
    Dependencies.coreKtx,
    Dependencies.composeMaterial,
    Dependencies.composeNavigation,
    Dependencies.activityCompose,
    Dependencies.composeUi,
    Dependencies.composeUiToolingPreview,
    Dependencies.hiltNavigationCompose
)


internal val androidxLifeCycleDependencies = listOf(
    Dependencies.viewModel,
    Dependencies.liveData,
    Dependencies.lifecycleRuntime,
    Dependencies.viewModelSaveState,
    Dependencies.lifecycleService,
    Dependencies.lifecycle,
)

//internal val androidxNavigationDependencies = listOf(
//    Dependencies.navigationFragment,
//    Dependencies.navigationUi,
//)

internal val coroutinesAndroidDependencies = listOf(
    Dependencies.kotlinCoroutines,
)

internal val rxjava3Dependencies = listOf(
    Dependencies.rxJava3,
    Dependencies.rxJava3Android
)

//internal val hiltJetpack = listOf(
//    Dependencies.hiltNavigation
//)

internal val firebaseDependencies = listOf(
    Dependencies.firebaseBom,
    Dependencies.firebaseCore,
    Dependencies.firebaseMessaging,
    Dependencies.firebaseAnalytics,
    Dependencies.firebaseCrashlytics,
)

internal val playStoreAppUpdateDependencies = listOf(
    Dependencies.playApUpdate,
    Dependencies.playApUpdateKtx
)

internal val facebookDependencies = listOf(
    Dependencies.facebookSdk,
    Dependencies.facebookMarketing
)

internal val googleMapDependencies = listOf(
    Dependencies.mapSdk,
    Dependencies.mapLocation,
    Dependencies.mapPlaces,
)


internal val networkDependencies = listOf(
    Dependencies.retrofit,
    Dependencies.retrofitGsonConverter,
    Dependencies.gson,
    Dependencies.okhHttp3,
    Dependencies.okhHttp3Interceptor,
    Dependencies.rxJava3adapter,
)


internal val androidResponsiveSizeDependencies = listOf(
    Dependencies.sdp,
    Dependencies.ssp,
)



