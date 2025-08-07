package com.fxynos.chepuha.domain.exception

import com.fxynos.chepuha.domain.value.PlayerName

class PlayerAlreadyAddedException(val player: PlayerName): IllegalStateException()