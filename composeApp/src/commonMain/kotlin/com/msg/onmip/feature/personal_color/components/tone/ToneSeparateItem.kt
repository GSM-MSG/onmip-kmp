package com.msg.onmip.feature.personal_color.components.tone

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Green
import com.msg.onmip.shared.ui.theme.typography.AppFont
import onmip.composeapp.generated.resources.Res
import onmip.composeapp.generated.resources.ic_green_check
import org.jetbrains.compose.resources.painterResource

@Composable
fun ToneSeparateItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    color: Color,
    description: String,
    onClick: () -> Unit,
) {
    Box {
        Column {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color)
                    .clickable(onClick = onClick)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = description,
                style = TextStyle(
                    fontFamily = AppFont(),
                    color = Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }

    AnimatedVisibility(
        visible = selected,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        SelectedBoxCover()
    }
}

@Composable
fun SelectedBoxCover() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .clip(RoundedCornerShape(12.dp))
            .border(3.dp, Green, RoundedCornerShape(12.dp))
            .background(Black.copy(alpha = 0.2f))
    ) {
        Image(
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.TopEnd),
            painter = painterResource(Res.drawable.ic_green_check),
            contentDescription = null
        )
    }
}