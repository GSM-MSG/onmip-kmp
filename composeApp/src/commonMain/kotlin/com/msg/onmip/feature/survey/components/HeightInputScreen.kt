package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.feature.survey.model.SurveyIntent

@Composable
fun HeightInputScreen(
    modifier: Modifier = Modifier,
    height: String,
    onIntent: (SurveyIntent) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E8)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "키를 입력해주세요",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7D32)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "cm 단위로 입력해주세요",
                fontSize = 16.sp,
                color = Color(0xFF424242)
            )
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(
                value = height,
                onValueChange = { onIntent(SurveyIntent.UpdateHeight(it)) },
                label = { Text("키 (cm)") },
                singleLine = true,
                modifier = Modifier.width(200.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { onIntent(SurveyIntent.NextPage) },
                enabled = height.isNotEmpty(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2E7D32)
                )
            ) {
                Text("다음", color = Color.White)
            }
        }
    }
} 