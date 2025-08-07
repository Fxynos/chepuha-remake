package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.PlayerDataSource
import com.fxynos.chepuha.domain.boundary.QuestionDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.model.PlayerAnswer
import com.fxynos.chepuha.domain.model.StoryTellingDataSource
import javax.inject.Inject

class AddAnswerUseCase @Inject constructor(
    private val storyTelling: StoryTellingDataSource,
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