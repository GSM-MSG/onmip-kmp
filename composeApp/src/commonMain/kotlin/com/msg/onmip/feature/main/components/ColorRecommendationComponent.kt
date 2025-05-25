package com.msg.onmip.feature.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Blue
import com.msg.onmip.shared.ui.theme.color.Red
import com.msg.onmip.shared.ui.theme.color.Yellow
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun ColorRecommendationComponent(modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(all = 16.dp)) {
        Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier.fillMaxWidth().aspectRatio(1f)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Blue)
            )
            Box(modifier = Modifier.height(16.dp))
            Text("파랑", style = TextStyle(color = Black, fontSize = 16.sp, fontFamily = AppFont()))
        }
        Box(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier.fillMaxWidth().aspectRatio(1f)
                    .clip(shape = RoundedCornerShape(12.dp)).background(color = Yellow)
            )
            Box(modifier = Modifier.height(16.dp))
            Text("노랑", style = TextStyle(color = Black, fontSize = 16.sp, fontFamily = AppFont()))
        }
        Box(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier.fillMaxWidth().aspectRatio(1f)
                    .clip(shape = RoundedCornerShape(12.dp)).background(color = Red)
            )
            Box(modifier = Modifier.height(16.dp))
            Text("빨강", style = TextStyle(color = Black, fontSize = 16.sp, fontFamily = AppFont()))
        }
    }
}