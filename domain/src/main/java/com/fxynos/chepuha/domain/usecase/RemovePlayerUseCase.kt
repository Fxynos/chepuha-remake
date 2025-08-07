package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.PlayerDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.value.PlayerName
import javax.inject.Inject

class RemovePlayerUseCase @Inject constructor(
    private val dataSource: PlayerDataSource
): SuspendedUseCase<PlayerName, Unit> {
    override suspend fun invoke(param: PlayerName) =
        dataSource.remove(param)
}