package com.msg.onmip.feature.personal_color.agent

import androidx.compose.ui.graphics.ImageBitmap
import com.msg.onmip.feature.personal_color.agent.model.SegmentationState
import kotlinx.coroutines.flow.Flow

interface FaceSegmentAgent {

    fun segmentFace(image: ImageBitmap): Flow<SegmentationState>
}