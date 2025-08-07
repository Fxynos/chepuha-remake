package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.boundary.StoryDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.model.Story
import javax.inject.Inject

class RemoveStoryUseCase @Inject constructor(
    private val dataSource: StoryDataSource
): SuspendedUseCase<Story, Unit> {
    override suspend fun invoke(param: Story) =
        dataSource.remove(param)
}