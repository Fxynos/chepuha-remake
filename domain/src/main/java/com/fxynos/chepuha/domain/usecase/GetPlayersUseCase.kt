package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.PlayerDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.value.PlayerName
import javax.inject.Inject

class GetPlayersUseCase @Inject constructor(
    private val dataSource: PlayerDataSource
): SuspendedUseCase<Unit, List<PlayerName>> {
    override suspend fun invoke(param: Unit): List<PlayerName> =
        dataSource.getAll()
}