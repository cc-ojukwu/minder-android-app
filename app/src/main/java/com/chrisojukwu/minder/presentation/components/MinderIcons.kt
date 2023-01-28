package com.chrisojukwu.minder.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.chrisojukwu.minder.R

object MinderIcons {
    val Home = R.drawable.baseline_timeline_24
    val Month = R.drawable.baseline_bedtime_24
    val Year = R.drawable.baseline_calendar_month_24
    val Settings = R.drawable.baseline_settings_24
}

sealed class Icon {
    data class ImageVectorIcon(val imageVector: ImageVector) : Icon()
    data class DrawableResourceIcon(@DrawableRes val id: Int) : Icon()
}