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
fun WeightInputScreen(
    modifier: Modifier = Modifier,
    weight: String,
    onIntent: (SurveyIntent) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFCE4EC)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "몸무게를 입력해주세요",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFC2185B)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "kg 단위로 입력해주세요",
                fontSize = 16.sp,
                color = Color(0xFF424242)
            )
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(
                value = weight,
                onValueChange = { onIntent(SurveyIntent.UpdateWeight(it)) },
                label = { Text("몸무게 (kg)") },
                singleLine = true,
                modifier = Modifier.width(200.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { onIntent(SurveyIntent.NextPage) },
                enabled = weight.isNotEmpty(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFC2185B)
                )
            ) {
                Text("다음", color = Color.White)
            }
        }
    }
} 