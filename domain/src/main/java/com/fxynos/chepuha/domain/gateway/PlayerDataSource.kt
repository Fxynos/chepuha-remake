package com.fxynos.chepuha.domain.gateway

import com.fxynos.chepuha.domain.exception.PlayerAlreadyAddedException
import com.fxynos.chepuha.domain.value.PlayerName

interface PlayerDataSource {
    suspend fun getAll(): List<PlayerName>
    @Throws(PlayerAlreadyAddedException::class)
    suspend fun add(player: PlayerName)
    suspend fun remove(player: PlayerName)
}