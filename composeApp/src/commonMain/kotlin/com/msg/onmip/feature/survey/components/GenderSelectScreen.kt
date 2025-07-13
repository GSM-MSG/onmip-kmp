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
fun GenderSelectScreen(
    modifier: Modifier = Modifier,
    selectedGender: String?,
    onIntent: (SurveyIntent) -> Unit
) {
    val genders = listOf("남성", "여성")
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "성별을 선택해주세요",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1976D2)
            )
            Spacer(modifier = Modifier.height(32.dp))
            
            genders.forEach { gender ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 8.dp)
                        .clickable { 
                            onIntent(SurveyIntent.SelectGender(gender))
                        }
                        .border(
                            width = if (selectedGender == gender) 2.dp else 1.dp,
                            color = if (selectedGender == gender) Color(0xFF1976D2) else Color.Gray
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = if (selectedGender == gender) Color(0xFFE3F2FD) else Color.White
                    )
                ) {
                    Text(
                        text = gender,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 16.sp,
                        color = if (selectedGender == gender) Color(0xFF1976D2) else Color.Black
                    )
                }
            }
        }
    }
}