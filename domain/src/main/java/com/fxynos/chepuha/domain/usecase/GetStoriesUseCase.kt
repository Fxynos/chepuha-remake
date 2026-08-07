package com.fxynos.chepuha.domain.usecase

import com.fxynos.chepuha.domain.contract.SuspendedUseCase
import com.fxynos.chepuha.domain.gateway.StoryReader
import com.fxynos.chepuha.domain.model.Story
import javax.inject.Inject

class GetStoriesUseCase @Inject constructor(
    private val storyReader: StoryReader
): SuspendedUseCase<Unit, List<Story>> {
    override suspend fun invoke(param: Unit): List<Story> =
        storyReader.getAll()
}