package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.feature.survey.model.SurveyIntent
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun GenderSelectScreen(
    modifier: Modifier = Modifier,
    selectedGender: String?,
    onIntent: (SurveyIntent) -> Unit,
) {
    val genders = listOf("남성", "여성")

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier.padding(top = 20.dp, bottom = 12.dp),
            text = "성별을 선택해주세요",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = AppFont(),
            color = Black
        )
        Row(modifier = Modifier.padding(16.dp)) {
            genders.forEach { gender ->
                ChipComponent(
                    modifier = Modifier.padding(8.dp),
                    text = gender,
                    isSelected = selectedGender == gender,
                    onClick = {
                        onIntent(SurveyIntent.SelectGender(gender))
                    }
                )
            }
        }
    }
}