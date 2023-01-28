package com.chrisojukwu.minder.presentation.components

import androidx.annotation.StringRes
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.chrisojukwu.minder.ui.theme.MinderTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MinderTopAppBar(
    @StringRes titleRes: Int,
    modifier: Modifier = Modifier,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors()
) {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = titleRes)) },
        modifier = modifier,
        colors = colors
    )
}

@Composable
@Preview("Top App Bar")
@OptIn(ExperimentalMaterial3Api::class)
private fun MinderTopAppBarPreview() {
    MinderTopAppBar(
        titleRes = android.R.string.untitled
    )

}
