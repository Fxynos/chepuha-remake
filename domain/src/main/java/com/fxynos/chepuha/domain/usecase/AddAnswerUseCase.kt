package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.gateway.PlayerDataSource
import com.fxynos.chepuha.domain.gateway.QuestionDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.model.PlayerAnswer
import com.fxynos.chepuha.domain.gateway.StoryTellingStateSource
import javax.inject.Inject

class AddAnswerUseCase @Inject constructor(
    private val storyTelling: StoryTellingStateSource,
    private val questions: QuestionDataSource,
    private val players: PlayerDataSource
): SuspendedUseCase<PlayerAnswer, Unit> {
    override suspend fun invoke(param: PlayerAnswer) {
        val storyId = storyTelling.currentStoryId
        val storyQuestions = questions.getAll(storyId)
        val storyPlayers = players.getAll()

        if (storyTelling.currentQuestionIndex >= storyQuestions.size)
            throw IndexOutOfBoundsException("Too many answers")

        storyTelling.playerAnswers.add(param)

        if (storyTelling.currentPlayerIndex >= storyPlayers.lastIndex) {
            storyTelling.currentPlayerIndex = 0
            storyTelling.currentQuestionIndex++
        } else storyTelling.currentPlayerIndex++
    }
}