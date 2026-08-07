package com.fxynos.chepuha.data.datasource.question

import android.content.Context
import com.fxynos.chepuha.data.R
import com.fxynos.chepuha.data.util.stringprovider.ResourcesStringProvider
import com.fxynos.chepuha.data.util.stringprovider.StringProvider
import com.fxynos.chepuha.domain.exception.NoSuchStoryException
import com.fxynos.chepuha.domain.gateway.QuestionDataSource
import com.fxynos.chepuha.domain.model.StoryQuestion
import com.fxynos.chepuha.domain.value.StoryId

/**
 * Implementation of [QuestionDataSource] that contains questions for predefined stories.
 * Directly coupled with [com.fxynos.chepuha.data.datasource.story.PredefinedStoryReader].
 */
class PredefinedQuestionDataSource(
    context: Context
) : QuestionDataSource, StringProvider by ResourcesStringProvider(context) {
    companion object {
        val PREDEFINED_STORY_1_ID = StoryId(id = -1)
    }

    // instantiate new StoryQuestion's each time for language to correspond current context
    override suspend fun getAll(storyId: StoryId): List<StoryQuestion> = when (storyId) {
        PREDEFINED_STORY_1_ID -> getQuestionsOfStory1()
        else -> throw NoSuchStoryException(storyId)
    }

    private fun getQuestionsOfStory1(): List<StoryQuestion> = listOf(
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_1),
            beforeAnswer = string(R.string.predefined_story_1_question_before_1),
            afterAnswer = string(R.string.predefined_story_1_question_after_1)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_2),
            beforeAnswer = string(R.string.predefined_story_1_question_before_2),
            afterAnswer = string(R.string.predefined_story_1_question_after_2)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_3),
            beforeAnswer = string(R.string.predefined_story_1_question_before_3),
            afterAnswer = string(R.string.predefined_story_1_question_after_3)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_4),
            beforeAnswer = string(R.string.predefined_story_1_question_before_4),
            afterAnswer = string(R.string.predefined_story_1_question_after_4)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_5),
            beforeAnswer = string(R.string.predefined_story_1_question_before_5),
            afterAnswer = string(R.string.predefined_story_1_question_after_5)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_6),
            beforeAnswer = string(R.string.predefined_story_1_question_before_6),
            afterAnswer = string(R.string.predefined_story_1_question_after_6)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_7),
            beforeAnswer = string(R.string.predefined_story_1_question_before_7),
            afterAnswer = string(R.string.predefined_story_1_question_after_7)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_8),
            beforeAnswer = string(R.string.predefined_story_1_question_before_8),
            afterAnswer = string(R.string.predefined_story_1_question_after_8)
        ),
        StoryQuestion(
            question = string(R.string.predefined_story_1_question_9),
            beforeAnswer = string(R.string.predefined_story_1_question_before_9),
            afterAnswer = string(R.string.predefined_story_1_question_after_9)
        )
    )
}