package com.msg.onmip.feature.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Gray01
import com.msg.onmip.shared.ui.theme.typography.AppFont
import onmip.composeapp.generated.resources.Res
import onmip.composeapp.generated.resources.ic_setting
import org.jetbrains.compose.resources.painterResource

@Composable
fun WeatherItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth().padding(vertical = 12.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.padding(12.dp),
            painter = painterResource(Res.drawable.ic_setting),
            contentDescription = null
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(
                "24°C",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Black,
                    fontFamily = AppFont(),
                )
            )
            Text(
                "Sunny",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Gray01,
                    fontFamily = AppFont(),
                )
            )
        }
    }
}