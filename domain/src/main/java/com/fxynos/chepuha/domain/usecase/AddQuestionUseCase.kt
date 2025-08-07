package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.QuestionDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.model.StoryQuestion
import com.fxynos.chepuha.domain.value.StoryId
import javax.inject.Inject

class AddQuestionUseCase @Inject constructor(
    private val dataSource: QuestionDataSource
): SuspendedUseCase<AddQuestionUseCase.Param, Unit> {

    override suspend fun invoke(param: Param) =
        dataSource.add(param.storyId, param.question)

    data class Param(val storyId: StoryId, val question: StoryQuestion.UserDefined)
}