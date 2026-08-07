package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.contract.BlockingUseCase
import com.fxynos.chepuha.domain.gateway.StoryTellingStateSource
import com.fxynos.chepuha.domain.value.StoryId
import javax.inject.Inject

class StartStoryTellingUseCase @Inject constructor(
    private val dataSource: StoryTellingStateSource
): BlockingUseCase<StoryId, Unit> {
    override fun invoke(param: StoryId) {
        dataSource.apply {
            currentStoryId = param
            currentPlayerIndex = 0
            currentQuestionIndex = 0
        }
    }
}