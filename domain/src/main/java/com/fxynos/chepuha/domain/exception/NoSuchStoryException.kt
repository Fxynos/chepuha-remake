package com.fxynos.chepuha.domain.exception

import com.fxynos.chepuha.domain.value.StoryId

class NoSuchStoryException(val storyId: StoryId): NoSuchElementException(
    "No such story by id $storyId"
)