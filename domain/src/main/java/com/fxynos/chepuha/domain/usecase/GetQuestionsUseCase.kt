package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.QuestionDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.model.StoryQuestion
import com.fxynos.chepuha.domain.value.StoryId
import javax.inject.Inject

class GetQuestionsUseCase @Inject constructor(
    private val dataSource: QuestionDataSource
): SuspendedUseCase<StoryId, List<StoryQuestion>> {
    override suspend fun invoke(param: StoryId): List<StoryQuestion> =
        dataSource.getAll(param)
}