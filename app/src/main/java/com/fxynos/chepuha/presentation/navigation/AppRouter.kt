package com.fxynos.chepuha.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSerializable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.compose.serialization.serializers.SnapshotStateListSerializer
import com.fxynos.chepuha.presentation.screen.menu.MenuScreen

@Composable
fun AppRouter() {
    // rememberNavBackStack() loses type and forces it to be just `NavBackStack<NavKey>`
    val backStack = rememberSerializable(serializer = SnapshotStateListSerializer()) {
        mutableStateListOf<Destination>(Destination.MainMenu)
    }

    NavDisplay(
        backStack = backStack,
        onBack = { if (backStack.size > 1) backStack.removeLastOrNull() }
    ) { key ->
        when (key) {
            Destination.MainMenu -> NavEntry(key) { MenuScreen() }
            Destination.Players -> TODO()
            Destination.Game -> TODO()
            Destination.Results -> TODO()
        }
    }
}