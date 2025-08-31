package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Gray04
import com.msg.onmip.shared.ui.theme.color.White
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun CTALargeButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp))
            .background(color = if (isEnabled) Black else Gray04)
            .clickable(
                onClick = onClick,
                enabled = isEnabled,
                indication = null,
                interactionSource = remember { MutableInteractionSource() })
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center).padding(vertical = 12.dp),
            text = text,
            style = TextStyle(
                color = White,
                fontSize = 16.sp,
                fontFamily = AppFont(),
                fontWeight = FontWeight.Bold
            ),
        )
    }
}