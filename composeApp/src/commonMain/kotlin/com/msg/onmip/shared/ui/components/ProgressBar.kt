package com.msg.onmip.shared.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Gray06

@Composable
fun ProgressBar(
    modifier: Modifier = Modifier,
    progress: Float = 0f,
    backgroundColor: Color = Gray06,
    progressColor: Color = Black,
    animationDuration: Int = 500, // 애니메이션 지속 시간 (ms)
) {
    // progress 값을 애니메이션으로 부드럽게 전환
    val animatedProgress by animateFloatAsState(
        targetValue = progress.coerceIn(0f, 1f), // progress를 0~1 사이로 제한
        animationSpec = tween(durationMillis = animationDuration), // 애니메이션 속도와 타입 설정
        label = "ProgressAnimation"
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(animatedProgress) // 애니메이션된 progress 사용
                .height(8.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(progressColor)
                .align(Alignment.CenterStart)
        )
    }
}