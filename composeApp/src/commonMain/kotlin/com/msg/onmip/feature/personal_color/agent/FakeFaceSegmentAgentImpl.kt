package com.msg.onmip.feature.personal_color.agent

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import com.msg.onmip.feature.personal_color.agent.model.FaceSegmentResult
import com.msg.onmip.feature.personal_color.agent.model.SegmentationState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class FakeFaceSegmentAgentImpl : FaceSegmentAgent {
    override fun segmentFace(image: ImageBitmap): Flow<SegmentationState> {
        return flow {
            emit(SegmentationState.Loading(0f))
            delay(2000)
            emit(SegmentationState.Loading(20f))
            delay(2000)
            emit(SegmentationState.Loading(99f))
            emit(
                SegmentationState.Success(
                    FaceSegmentResult(
                        hair = Color(0xFF000000),
                        skin = Color(0xFFEFC4A3),
                        eyebrows = Color(0xFF000000),
                        eye = Color(0xFF000000),
                        ear = Color(0xFFEFC4A3),
                        nose = Color(0xFFEFC4A3),
                        mouth = Color(0xFF722F37)
                    )
                )
            )
        }.flowOn(Dispatchers.IO)
    }
}