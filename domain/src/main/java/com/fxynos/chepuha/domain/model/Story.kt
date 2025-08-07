package com.fxynos.chepuha.domain.model

import androidx.annotation.StringRes

sealed interface Story {
    val id: Int

    data class Predefined(
        override val id: Int,
        @StringRes val title: Int
    ): Story

    data class UserDefined(
        override val id: Int,
        val title: String
    ): Story
}