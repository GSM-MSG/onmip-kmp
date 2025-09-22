package com.msg.onmip.feature.personal_color.agent.model

sealed interface SegmentationState {
    data class Success(val result: FaceSegmentResult) : SegmentationState

    data class Failure(val cause: Throwable) : SegmentationState

    data class Loading(val progress: Float) : SegmentationState
}