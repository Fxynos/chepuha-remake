package com.fxynos.chepuha.domain.gateway

import com.fxynos.chepuha.domain.model.Story

interface StoryDataSource {
    suspend fun add(story: Story.UserDefined)
    suspend fun getAll(): List<Story>
    suspend fun remove(story: Story)
}