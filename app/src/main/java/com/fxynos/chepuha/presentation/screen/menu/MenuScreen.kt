package com.fxynos.chepuha.presentation.screen.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fxynos.chepuha.presentation.component.CustomTextButton
import com.fxynos.chepuha.presentation.theme.AppTheme

@Preview(widthDp = 400, heightDp = 700, showBackground = true)
@Composable
fun MenuScreenPreview() {
    AppTheme {
        MenuScreen()
    }
}

@Composable
fun MenuScreen(
    onPlayClicked: () -> Unit = {},
    onHowToPlayClicked: () -> Unit = {},
    onExitClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize().wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        CustomTextButton(
            text = "Играть",
            style = MaterialTheme.typography.headlineMedium,
            onClick = onPlayClicked
        )
        CustomTextButton(
            text = "Как играть?",
            style = MaterialTheme.typography.titleLarge,
            onClick = onHowToPlayClicked
        )
        CustomTextButton(
            text = "Выход",
            style = MaterialTheme.typography.titleLarge,
            onClick = onExitClicked
        )
    }
}