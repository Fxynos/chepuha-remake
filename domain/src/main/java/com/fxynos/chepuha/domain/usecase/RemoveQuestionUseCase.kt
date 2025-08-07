package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.QuestionDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.value.StoryId
import javax.inject.Inject

class RemoveQuestionUseCase @Inject constructor(
    private val dataSource: QuestionDataSource
): SuspendedUseCase<RemoveQuestionUseCase.Param, Unit> {
    override suspend fun invoke(param: Param) =
        dataSource.remove(param.storyId, param.questionIndex)

    data class Param(val storyId: StoryId, val questionIndex: Int)
}