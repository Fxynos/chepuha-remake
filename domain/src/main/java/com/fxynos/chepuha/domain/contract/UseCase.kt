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

operator fun <R> BlockingUseCase<Unit, R>.invoke() = invoke(Unit)
suspend operator fun <R> SuspendedUseCase<Unit, R>.invoke() = invoke(Unit)
operator fun <R> FlowUseCase<Unit, R>.invoke() = invoke(Unit)