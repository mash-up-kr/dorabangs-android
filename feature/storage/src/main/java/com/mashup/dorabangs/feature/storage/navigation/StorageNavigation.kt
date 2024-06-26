package com.mashup.dorabangs.feature.storage.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.mashup.core.navigation.NavigationRoute
import com.mashup.dorabangs.feature.storage.storage.StorageRoute

fun NavController.navigateToStorage(navOptions: NavOptions) = navigate(NavigationRoute.StorageScreen.route, navOptions)

fun NavGraphBuilder.storageNavigation(navController: NavController) {
    composable(
        route = NavigationRoute.StorageScreen.route,
    ) {
        StorageRoute(
            navigateToStorageDetail = { selectItem ->
                navController.navigateToStorageDetail()
            },
        )
    }
}
