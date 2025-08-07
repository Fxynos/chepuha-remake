package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.contract.BlockingUseCase
import com.fxynos.chepuha.domain.model.StoryTellingDataSource
import com.fxynos.chepuha.domain.value.StoryId
import javax.inject.Inject

class StartStoryTellingUseCase @Inject constructor(
    private val dataSource: StoryTellingDataSource
): BlockingUseCase<StoryId, Unit> {
    override fun invoke(param: StoryId) {
        dataSource.apply {
            currentStoryId = param
            currentPlayerIndex = 0
            currentQuestionIndex = 0
        }
    }
}