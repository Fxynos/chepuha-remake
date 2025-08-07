package com.fxynos.chepuha.domain.model

import com.fxynos.chepuha.domain.value.StoryId

interface StoryTellingDataSource {
    var currentStoryId: StoryId
    var currentPlayerIndex: Int
    var currentQuestionIndex: Int
    val playerAnswers: MutableList<PlayerAnswer>
}