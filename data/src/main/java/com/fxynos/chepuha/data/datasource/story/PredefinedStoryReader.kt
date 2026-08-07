package com.fxynos.chepuha.data.datasource.story

import android.content.Context
import com.fxynos.chepuha.data.R
import com.fxynos.chepuha.data.datasource.question.PredefinedQuestionDataSource
import com.fxynos.chepuha.data.util.stringprovider.ResourcesStringProvider
import com.fxynos.chepuha.data.util.stringprovider.StringProvider
import com.fxynos.chepuha.domain.gateway.StoryReader
import com.fxynos.chepuha.domain.model.Story

/**
 * Directly coupled with [com.fxynos.chepuha.data.datasource.question.PredefinedQuestionDataSource].
 */
class PredefinedStoryReader(
    context: Context
) : StoryReader, StringProvider by ResourcesStringProvider(context) {

    override suspend fun getAll(): List<Story> = listOf(
        Story(
            id = PredefinedQuestionDataSource.PREDEFINED_STORY_1_ID,
            title = string(R.string.predefined_story_1_title)
        )
    )
}