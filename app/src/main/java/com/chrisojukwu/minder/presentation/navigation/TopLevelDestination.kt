package com.chrisojukwu.minder.presentation.navigation

import com.chrisojukwu.minder.R
import com.chrisojukwu.minder.presentation.components.Icon
import com.chrisojukwu.minder.presentation.components.MinderIcons

enum class TopLevelDestination(
    val selectedIcon: Icon,
    val unselectedIcon: Icon,
    val iconTextId: Int,
    val titleTextId: Int
) {
    HOME(
        selectedIcon = Icon.DrawableResourceIcon(MinderIcons.Home),
        unselectedIcon = Icon.DrawableResourceIcon(MinderIcons.Home),
        iconTextId = R.string.home,
        titleTextId = R.string.app_name
    ),
    MONTH(
        selectedIcon = Icon.DrawableResourceIcon(MinderIcons.Month),
        unselectedIcon = Icon.DrawableResourceIcon(MinderIcons.Month),
        iconTextId = R.string.month,
        titleTextId = R.string.monthly_report
    ),
    YEAR(
        selectedIcon = Icon.DrawableResourceIcon(MinderIcons.Year),
        unselectedIcon = Icon.DrawableResourceIcon(MinderIcons.Year),
        iconTextId = R.string.year,
        titleTextId = R.string.yearly_report
    ),
    SETTINGS(
        selectedIcon = Icon.DrawableResourceIcon(MinderIcons.Settings),
        unselectedIcon = Icon.DrawableResourceIcon(MinderIcons.Settings),
        iconTextId = R.string.settings,
        titleTextId = R.string.settings
    )
}