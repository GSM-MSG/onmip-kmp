package com.msg.onmip.shared.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
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
    progress: Float,
    backgroundColor: Color = Gray06,
    progressColor: Color = Black,
) {
    Box(
        modifier = modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp))
            .background(backgroundColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress)
                .height(8.dp)
                .clip(
                    RoundedCornerShape(4.dp)
                )
                .background(progressColor)
                .align(Alignment.CenterStart)
        )
    }
}