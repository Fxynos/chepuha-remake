package com.fxynos.chepuha.domain.boundary

import com.fxynos.chepuha.domain.model.StoryQuestion
import com.fxynos.chepuha.domain.value.StoryId

interface QuestionDataSource {
    suspend fun add(storyId: StoryId, question: StoryQuestion.UserDefined)
    suspend fun getAll(storyId: StoryId): List<StoryQuestion>
    suspend fun remove(storyId: StoryId, questionIndex: Int)
}