package com.fxynos.chepuha.domain.model

import androidx.annotation.StringRes

sealed interface StoryQuestion {
    val index: Int

    /**
     * @param question hint for user to input answer
     * @param beforeAnswer prefix before answer in the final story
     * @param afterAnswer suffix after answer in the final story
     */
    data class Predefined(
        override val index: Int,
        @StringRes val question: Int,
        @StringRes val beforeAnswer: Int,
        @StringRes val afterAnswer: Int
    ): StoryQuestion

    data class UserDefined(
        override val index: Int,
        val question: String,
        val beforeAnswer: String,
        val afterAnswer: String
    ): StoryQuestion
}