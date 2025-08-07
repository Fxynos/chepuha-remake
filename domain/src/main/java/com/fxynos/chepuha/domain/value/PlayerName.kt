package com.fxynos.chepuha.domain.value

import com.fxynos.chepuha.domain.exception.InvalidPlayerNameException

@JvmInline
value class PlayerName(val name: String) {
    init {
        if (name.isBlank())
            throw InvalidPlayerNameException(name)
    }
}