package com.fxynos.chepuha.domain.gateway

import com.fxynos.chepuha.domain.model.Story

/**
 * Stories read-only data source
 */
interface StoryReader {
    suspend fun getAll(): List<Story>
}