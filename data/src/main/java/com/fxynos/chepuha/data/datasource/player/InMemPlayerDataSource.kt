package com.fxynos.chepuha.data.datasource.player

import com.fxynos.chepuha.domain.gateway.PlayerDataSource
import com.fxynos.chepuha.domain.value.PlayerName
import java.util.LinkedList

class InMemPlayerDataSource : PlayerDataSource {

    private val players = LinkedList<PlayerName>()

    override suspend fun getAll(): List<PlayerName> =
        players

    override suspend fun add(player: PlayerName) {
        players += player
    }

    override suspend fun remove(player: PlayerName) {
        players -= player
    }
}