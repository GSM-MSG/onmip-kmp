package com.msg.onmip.feature.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.White
import com.msg.onmip.shared.ui.theme.typography.AppFont
import onmip.composeapp.generated.resources.Res
import onmip.composeapp.generated.resources.ic_setting
import org.jetbrains.compose.resources.painterResource

@Composable
fun MainAppBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth().background(color = White)
    ) {
        Text(
            modifier = Modifier.align(alignment = Alignment.Center),
            text = "오늘 뭐입",
            style = TextStyle(
                fontFamily = AppFont(),
                color = Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal
            ),
        )
        Image(
            modifier = Modifier.align(alignment = Alignment.CenterEnd).clickable(
                interactionSource = null,
                indication = null,
            ) {},
            painter = painterResource(Res.drawable.ic_setting),
            contentDescription = null
        )
    }
}