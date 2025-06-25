package com.msg.onmip.shared.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.White
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun FilledButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Black
        ),
        onClick = onClick
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = AppFont(),
                color = White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}