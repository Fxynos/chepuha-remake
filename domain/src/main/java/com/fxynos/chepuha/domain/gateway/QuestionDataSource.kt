package com.fxynos.chepuha.domain.gateway

import com.fxynos.chepuha.domain.model.StoryQuestion
import com.fxynos.chepuha.domain.value.StoryId

interface QuestionDataSource {
    suspend fun getAll(storyId: StoryId): List<StoryQuestion>
}