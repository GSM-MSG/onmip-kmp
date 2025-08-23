package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.Gray01
import com.msg.onmip.shared.ui.theme.color.White

@Composable
fun ChipComponent(
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    Card(
        modifier = modifier
            .padding(end = 16.dp)
            .clickable {
                onClick()
            },
        border = if (isSelected) null else BorderStroke(1.dp, Gray01),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isSelected) Black else Color.White
        )
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
            fontSize = 16.sp,
            color = if (isSelected) White else Black
        )
    }
}