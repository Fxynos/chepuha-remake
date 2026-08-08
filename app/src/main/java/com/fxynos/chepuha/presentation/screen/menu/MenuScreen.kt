package com.fxynos.chepuha.presentation.screen.menu

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(widthDp = 300, heightDp = 400, showBackground = true)
@Composable
fun MenuScreen(onNavigatePlayers: () -> Unit = {}) {
    Box(modifier = Modifier.fillMaxSize().wrapContentSize()) {
        Text(text = "Lorem ipsum")
    }
}