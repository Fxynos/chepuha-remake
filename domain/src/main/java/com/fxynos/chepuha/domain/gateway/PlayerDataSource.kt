package com.fxynos.chepuha.domain.gateway

import com.fxynos.chepuha.domain.exception.PlayerAlreadyAddedException
import com.fxynos.chepuha.domain.value.PlayerName

interface PlayerDataSource {
    @Throws(PlayerAlreadyAddedException::class)
    suspend fun add(player: PlayerName)
    suspend fun getAll(): List<PlayerName>
    suspend fun remove(player: PlayerName)
}