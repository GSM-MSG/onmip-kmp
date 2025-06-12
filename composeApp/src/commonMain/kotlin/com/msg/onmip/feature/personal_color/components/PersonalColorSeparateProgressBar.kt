package com.msg.onmip.feature.personal_color.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Gray02

@Composable
fun PersonalColorSeparateProgressBar(
    modifier: Modifier = Modifier,
    counts: Int,
    currentIndex: Int,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp),
    ) {
        Row(
            modifier = Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            (0 until counts).forEachIndexed { index, _ ->
                Box(
                    modifier = modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(if (index == currentIndex) Black else Gray02)
                )
            }
        }
    }
}