package com.chrisojukwu.minder.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.chrisojukwu.minder.presentation.navigation.*
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberMinderAppState(
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController()
): MinderAppState {
    return remember(navController, coroutineScope) {
        MinderAppState(navController, coroutineScope)
    }
}

@Stable
class MinderAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope
) {
    val currentDestination: NavDestination?
       @Composable get() = navController
           .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
       @Composable get() = when (currentDestination?.route) {
           homeRoute -> TopLevelDestination.HOME
           monthRoute -> TopLevelDestination.MONTH
           yearRoute -> TopLevelDestination.YEAR
           settingsRoute -> TopLevelDestination.SETTINGS
           else -> null
       }

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        when (topLevelDestination) {
            TopLevelDestination.HOME -> navController.navigateToHome()
            TopLevelDestination.MONTH -> navController.navigateToMonth()
            TopLevelDestination.YEAR -> navController.navigateToYear()
            TopLevelDestination.SETTINGS -> navController.navigateToSettings()
        }
    }

    fun onBackClick() {
        navController.popBackStack()
    }


}