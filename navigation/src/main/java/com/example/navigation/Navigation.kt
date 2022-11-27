package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.emon.profile.ProfileScreen
import com.emon.repositories.RepositoriesScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Repositories.route
    ) {

        composable(NavRoutes.Repositories.route) {
            RepositoriesScreen(onNavigateToProfile = { navController.navigate(NavRoutes.Profile.route+"/$it") })
        }
        composable(NavRoutes.Profile.route+ "/{userName}") {backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userName")?:""
            ProfileScreen(userId,navController)
        }
        /*firstGraph(navController)
        secondGraph(navController)*/
    }
}

/*fun NavGraphBuilder.firstGraph(navController: NavController) {
    navigation(startDestination = NavRoutes.Repositories.route, route = "first") {
        composable(NavRoutes.Repositories.route) {
            RepositoriesScreen(onNavigateToProfile = { navController.navigate(NavRoutes.Profile.route+"/$it") })
        }
    }
}

fun NavGraphBuilder.secondGraph(navController: NavController) {
    navigation(startDestination = NavRoutes.Profile.route, route = "second") {
        composable(NavRoutes.Profile.route+ "/{userName}") {backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userName")?:""
            ProfileScreen(userId,navController)
        }
    }
}*/

sealed class NavRoutes(val route: String) {
    object Repositories : NavRoutes("repositories")
    object Profile : NavRoutes("profile")
}