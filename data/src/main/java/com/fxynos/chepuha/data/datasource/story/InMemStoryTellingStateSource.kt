package com.fxynos.chepuha.data.datasource.story

import com.fxynos.chepuha.data.datasource.question.PredefinedQuestionDataSource
import com.fxynos.chepuha.domain.gateway.StoryTellingStateSource
import com.fxynos.chepuha.domain.model.PlayerAnswer
import com.fxynos.chepuha.domain.value.StoryId
import java.util.LinkedList

class InMemStoryTellingStateSource : StoryTellingStateSource {
    override var currentStoryId: StoryId = PredefinedQuestionDataSource.PREDEFINED_STORY_1_ID
    override var currentPlayerIndex: Int = 0
    override var currentQuestionIndex: Int = 0
    override val playerAnswers: MutableList<PlayerAnswer> = LinkedList()
}