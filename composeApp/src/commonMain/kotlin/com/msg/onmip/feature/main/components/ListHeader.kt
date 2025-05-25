package com.msg.onmip.feature.main.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun ListHeader(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier.fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp),
        text = title,
        style = TextStyle(
            fontFamily = AppFont(),
            color = Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )
    )
}