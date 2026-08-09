package com.fxynos.chepuha.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun CustomTextButtonPreview() {
    CustomTextButton(text = "Играть")
}

@Composable
fun CustomTextButton(
    text: String,
    style: TextStyle = MaterialTheme.typography.titleLarge,
    onClick: () -> Unit = {}
) {
    Box(
        Modifier.clickable(onClick = onClick)
            .padding(8.dp)
    ) {
        Text(
            text = text,
            style = style,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}