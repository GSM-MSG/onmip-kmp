package com.msg.onmip.feature.personal_color.components.tone

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun ToneSeparateSectionHeader(title: String) {
    Text(
        text = title,
        style = TextStyle(
            fontFamily = AppFont(),
            color = Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    )
}