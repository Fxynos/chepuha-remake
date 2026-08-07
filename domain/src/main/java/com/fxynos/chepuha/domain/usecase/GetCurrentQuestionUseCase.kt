package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.gateway.PlayerDataSource
import com.fxynos.chepuha.domain.gateway.QuestionDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.gateway.StoryTellingStateSource
import com.fxynos.chepuha.domain.model.StoryTellingState
import javax.inject.Inject

class GetCurrentQuestionUseCase @Inject constructor(
    private val storyTelling: StoryTellingStateSource,
    private val players: PlayerDataSource,
    private val questions: QuestionDataSource
): SuspendedUseCase<Unit, StoryTellingState?> {
    /**
     * @return `null` if story finished and there's no questions left
     */
    override suspend fun invoke(param: Unit): StoryTellingState? {
        val storyQuestions = questions.getAll(storyTelling.currentStoryId)

        if (storyTelling.currentQuestionIndex >= storyQuestions.size)
            return null

        return StoryTellingState(
            currentPlayer = players.getAll()[storyTelling.currentPlayerIndex],
            currentQuestion = storyQuestions[storyTelling.currentQuestionIndex]
        )
    }
}