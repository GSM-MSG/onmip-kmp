package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.feature.survey.model.SurveyIntent
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun HeightInputScreen(
    modifier: Modifier = Modifier,
    height: String,
    onIntent: (SurveyIntent) -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(
                modifier = Modifier.padding(top = 20.dp, bottom = 32.dp),
                text = "키를 선택해주세요",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = AppFont(),
                color = Black
            )
            
            // LazyVerticalGrid를 사용하여 키 옵션들을 배치
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 80.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items((140..200 step 5).toList()) { heightValue ->
                    HeightOptionButton(
                        height = heightValue.toString(),
                        isSelected = height == heightValue.toString(),
                        onClick = { 
                            onIntent(SurveyIntent.UpdateHeight(heightValue.toString()))
                        }
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            
            // 직접 입력 필드
            OutlinedTextField(
                value = height,
                onValueChange = { newHeight ->
                    onIntent(SurveyIntent.UpdateHeight(newHeight))
                },
                label = { Text("직접 입력 (cm)") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // 다음 버튼
            Button(
                onClick = { 
                    // 다음 화면으로 이동하는 로직
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = height.isNotEmpty()
            ) {
                Text("다음")
            }
        }
    }
}

@Composable
private fun HeightOptionButton(
    height: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = if (isSelected) Color(0xFF6200EE) else Color(0xFFF5F5F5)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = if (isSelected) 4.dp else 1.dp
        )
    ) {
        Text(
            text = "${height}cm",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            fontSize = 16.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
            color = if (isSelected) Color.White else Black,
            fontFamily = AppFont()
        )
    }
}