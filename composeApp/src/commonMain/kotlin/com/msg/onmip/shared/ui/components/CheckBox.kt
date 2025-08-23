package com.msg.onmip.shared.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Gray06
import com.msg.onmip.shared.ui.theme.color.White
import onmip.composeapp.generated.resources.Res
import onmip.composeapp.generated.resources.ic_check_16
import org.jetbrains.compose.resources.painterResource

@Composable
fun CheckBox(modifier: Modifier = Modifier, isChecked: Boolean, onClick: () -> Unit) {
    Box(
        modifier.size(20.dp).border(
            width = 2.dp,
            color = if (isChecked) {
                Black
            } else {
                Gray06
            },
            shape = RoundedCornerShape(4.dp)
        ).clip(RoundedCornerShape(4.dp)).background(color = if (isChecked) Black else White)
            .clickable(onClick = onClick)
    ) {
        Icon(
            painter = painterResource(Res.drawable.ic_check_16),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center),
            tint = White
        )
    }
}