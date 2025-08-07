package com.fxynos.chepuha.domain.contract

import kotlinx.coroutines.flow.Flow

sealed interface UseCase

interface BlockingUseCase<T, R>: UseCase {
    operator fun invoke(param: T): R
}

interface SuspendedUseCase<T, R>: UseCase {
    suspend operator fun invoke(param: T): R
}

interface FlowUseCase<T, R>: UseCase {
    operator fun invoke(param: T): Flow<R>
}

operator fun BlockingUseCase<Unit, *>.invoke() = invoke(Unit)
suspend operator fun SuspendedUseCase<Unit, *>.invoke() = invoke(Unit)
operator fun FlowUseCase<Unit, *>.invoke() = invoke(Unit)