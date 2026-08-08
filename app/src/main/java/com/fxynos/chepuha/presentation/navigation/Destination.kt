package com.fxynos.chepuha.presentation.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Destination : NavKey {
    @Serializable data object MainMenu : Destination
    @Serializable data object Players : Destination
    @Serializable data object Game : Destination
    @Serializable data object Results : Destination
}