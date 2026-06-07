package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.gateway.StoryDataSource
import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.model.Story
import javax.inject.Inject

class AddStoryUseCase @Inject constructor(
    private val dataSource: StoryDataSource
): SuspendedUseCase<Story.UserDefined, Unit> {
    override suspend fun invoke(param: Story.UserDefined) =
        dataSource.add(param)
}