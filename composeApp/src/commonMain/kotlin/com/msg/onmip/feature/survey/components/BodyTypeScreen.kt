package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
fun BodyTypeScreen(
    modifier: Modifier = Modifier,
    selectedBodyType: String?,
    onIntent: (SurveyIntent) -> Unit
) {
    val bodyTypes = listOf("마른 체형", "보통 체형", "통통한 체형")
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE1F5FE)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "체형을 선택해주세요",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0277BD)
            )
            Spacer(modifier = Modifier.height(32.dp))
            
            bodyTypes.forEach { bodyType ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 8.dp)
                        .clickable { 
                            onIntent(SurveyIntent.SelectBodyType(bodyType))
                        }
                        .border(
                            width = if (selectedBodyType == bodyType) 2.dp else 1.dp,
                            color = if (selectedBodyType == bodyType) Color(0xFF0277BD) else Color.Gray
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = if (selectedBodyType == bodyType) Color(0xFFE3F2FD) else Color.White
                    )
                ) {
                    Text(
                        text = bodyType,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 16.sp,
                        color = if (selectedBodyType == bodyType) Color(0xFF0277BD) else Color.Black
                    )
                }
            }
        }
    }
} 