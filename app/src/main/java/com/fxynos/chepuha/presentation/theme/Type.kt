package com.fxynos.chepuha.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import com.fxynos.chepuha.presentation.R

@OptIn(ExperimentalTextApi::class)
private fun playpenSansFontForWeight(weight: FontWeight) = Font(
    resId = R.font.playpen_sans_variable,
    weight = weight,
    variationSettings = FontVariation.Settings(FontVariation.weight(weight.weight))
)

val bodyFontFamily = FontFamily(
    playpenSansFontForWeight(FontWeight.Thin), // 100
    playpenSansFontForWeight(FontWeight.ExtraLight), // 200
    playpenSansFontForWeight(FontWeight.Light), // 300
    playpenSansFontForWeight(FontWeight.Normal), // 400
    playpenSansFontForWeight(FontWeight.Medium), // 500
    playpenSansFontForWeight(FontWeight.SemiBold), // 600
    playpenSansFontForWeight(FontWeight.Bold), // 700
    playpenSansFontForWeight(FontWeight.ExtraBold), // 800
    playpenSansFontForWeight(FontWeight.Black) // 900
)

val displayFontFamily = bodyFontFamily

// Default Material 3 typography values
val baseline = Typography()

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
)