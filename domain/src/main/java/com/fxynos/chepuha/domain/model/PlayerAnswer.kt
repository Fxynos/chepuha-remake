package com.fxynos.chepuha.domain.model

import com.fxynos.chepuha.domain.exception.InvalidPlayerAnswerException
import com.fxynos.chepuha.domain.value.PlayerName

data class PlayerAnswer(val player: PlayerName, val answer: String) {
    init {
        if (answer.isBlank())
            throw InvalidPlayerAnswerException(answer)
    }
}