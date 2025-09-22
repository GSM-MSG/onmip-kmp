package com.msg.onmip.feature.personal_color.agent.model

import androidx.compose.ui.graphics.Color

data class FaceSegmentResult(
    val hair: Color?,
    val skin: Color?,
    val eyebrows: Color?,
    val eye: Color?,
    val ear: Color?,
    val nose: Color?,
    val mouth: Color?,
)
