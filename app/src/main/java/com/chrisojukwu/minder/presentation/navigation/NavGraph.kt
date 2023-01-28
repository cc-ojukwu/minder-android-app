package com.chrisojukwu.minder.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chrisojukwu.minder.presentation.HomeRoute
import com.chrisojukwu.minder.presentation.month.MonthRoute
import com.chrisojukwu.minder.presentation.settings.SettingsRoute
import com.chrisojukwu.minder.presentation.year.YearRoute

const val homeRoute = "home_route"
const val monthRoute = "month_route"
const val yearRoute = "year_route"
const val settingsRoute = "settings_route"

fun NavController.navigateToHome() {
    this.navigate(homeRoute)
}

fun NavGraphBuilder.homeScreen() {
    composable(route = homeRoute) {
        HomeRoute()
    }
}

fun NavController.navigateToMonth() {
    this.navigate(monthRoute)
}

fun NavGraphBuilder.monthScreen() {
    composable(route = monthRoute) {
        MonthRoute()
    }
}

fun NavController.navigateToYear() {
    this.navigate(yearRoute)
}

fun NavGraphBuilder.yearScreen() {
    composable(route = yearRoute) {
        YearRoute()
    }
}

fun NavController.navigateToSettings() {
    this.navigate(settingsRoute)
}

fun NavGraphBuilder.settingsScreen() {
    composable(route = settingsRoute) {
        SettingsRoute()
    }
}
