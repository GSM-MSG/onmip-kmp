package com.msg.onmip.feature.main.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.msg.onmip.shared.ui.theme.color.Blue
import com.msg.onmip.shared.ui.theme.color.Red
import com.msg.onmip.shared.ui.theme.color.Yellow

@Composable
fun ColorRecommendationComponent(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        ColorRecommendationItem(modifier = Modifier.weight(1f), color = Blue, text = "파랑")
        ColorRecommendationItem(modifier = Modifier.weight(1f), color = Yellow, text = "노랑")
        ColorRecommendationItem(modifier = Modifier.weight(1f), color = Red, text = "빨강")
    }
}