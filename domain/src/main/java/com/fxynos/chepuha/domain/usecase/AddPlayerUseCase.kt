package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.gateway.PlayerDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.exception.PlayerAlreadyAddedException
import com.fxynos.chepuha.domain.value.PlayerName
import javax.inject.Inject

class AddPlayerUseCase @Inject constructor(
    private val dataSource: PlayerDataSource
): SuspendedUseCase<PlayerName, Unit> {
    override suspend fun invoke(param: PlayerName) =
        if (dataSource.getAll().contains(param))
            throw PlayerAlreadyAddedException(param)
        else
            dataSource.add(param)
}