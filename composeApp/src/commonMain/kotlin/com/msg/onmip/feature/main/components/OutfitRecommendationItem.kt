package com.msg.onmip.feature.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.typography.AppFont
import onmip.composeapp.generated.resources.Res
import onmip.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun OutfitRecommendationItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth().padding(bottom = 12.dp)) {
        Image(
            modifier = Modifier.aspectRatio(173f / 231f).clip(RoundedCornerShape(8.dp))
                .padding(bottom = 12.dp),
            painter = painterResource(Res.drawable.compose_multiplatform),
            contentDescription = null,
        )
        Text(
            "텍스트", style = TextStyle(
                color = Black,
                fontSize = 16.sp,
                fontFamily = AppFont(),
                fontWeight = FontWeight.Normal
            )
        )
    }
}