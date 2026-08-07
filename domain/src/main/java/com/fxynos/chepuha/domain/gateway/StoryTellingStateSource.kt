package com.fxynos.chepuha.domain.gateway

import com.fxynos.chepuha.domain.model.PlayerAnswer
import com.fxynos.chepuha.domain.value.StoryId

interface StoryTellingStateSource {
    var currentStoryId: StoryId
    var currentPlayerIndex: Int
    var currentQuestionIndex: Int
    val playerAnswers: MutableList<PlayerAnswer>
}