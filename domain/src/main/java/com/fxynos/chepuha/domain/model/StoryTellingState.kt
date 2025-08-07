package com.fxynos.chepuha.domain.model

import com.fxynos.chepuha.domain.value.PlayerName

data class StoryTellingState(val currentPlayer: PlayerName, val currentQuestion: StoryQuestion)