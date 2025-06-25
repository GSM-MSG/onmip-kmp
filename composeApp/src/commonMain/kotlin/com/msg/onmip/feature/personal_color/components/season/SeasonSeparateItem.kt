package com.msg.onmip.feature.personal_color.components.season

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.msg.onmip.shared.ui.theme.color.Gray01
import com.msg.onmip.shared.ui.theme.color.Green

@Composable
fun SeasonSeparateItem(
    modifier: Modifier = Modifier,
    color: Color,
    selected: Boolean,
) {
    val borderWidth by animateDpAsState(
        targetValue = if (selected) 3.dp else 1.dp,
        animationSpec = tween(durationMillis = 300),
        label = "borderWidth"
    )
    val borderColor by animateColorAsState(
        targetValue = if (selected) Green else Gray01,
        animationSpec = tween(durationMillis = 300),
        label = "borderColor"
    )

    Box(
        modifier = modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(color)
            .border(borderWidth, borderColor, CircleShape)
    )
}