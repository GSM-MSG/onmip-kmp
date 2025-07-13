package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun StylePreferenceScreen(
    modifier: Modifier = Modifier,
    selectedStyles: Set<String>,
    onIntent: (SurveyIntent) -> Unit
) {
    val styleOptions = listOf(
        "캐주얼", "스포티", "클래식", "빈티지", "스트릿", 
        "미니멀", "로맨틱", "모던", "레트로", "아방가르드"
    )
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3E5F5)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "선호하는 스타일을 선택해주세요",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7B1FA2)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "여러 개 선택 가능합니다",
                fontSize = 16.sp,
                color = Color(0xFF424242)
            )
            Spacer(modifier = Modifier.height(32.dp))
            
            styleOptions.chunked(2).forEach { rowStyles ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    rowStyles.forEach { style ->
                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .padding(8.dp)
                                .clickable {
                                    onIntent(SurveyIntent.ToggleStyle(style))
                                }
                                .border(
                                    width = if (selectedStyles.contains(style)) 2.dp else 1.dp,
                                    color = if (selectedStyles.contains(style)) Color(0xFF7B1FA2) else Color.Gray
                                ),
                            colors = CardDefaults.cardColors(
                                containerColor = if (selectedStyles.contains(style)) Color(0xFFF3E5F5) else Color.White
                            )
                        ) {
                            Text(
                                text = style,
                                modifier = Modifier.padding(16.dp),
                                fontSize = 14.sp,
                                color = if (selectedStyles.contains(style)) Color(0xFF7B1FA2) else Color.Black
                            )
                        }
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { onIntent(SurveyIntent.SubmitSurvey) },
                enabled = selectedStyles.isNotEmpty(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF7B1FA2)
                )
            ) {
                Text("완료", color = Color.White)
            }
        }
    }
} 