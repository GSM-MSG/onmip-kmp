package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.feature.survey.model.BodyType
import com.msg.onmip.feature.survey.model.SurveyIntent
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun BodyTypeScreen(
    modifier: Modifier = Modifier,
    bodyType: BodyType?,
    onIntent: (SurveyIntent) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            modifier = Modifier.padding(top = 20.dp, bottom = 32.dp),
            text = "체형을 선택해주세요",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = AppFont(),
            color = Black
        )

        // FlowRow를 사용하여 체형 옵션들을 배치
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            val bodyTypeOptions = BodyType.entries
            
            bodyTypeOptions.forEachIndexed { index, bodyTypeValue ->
                if (index > 0) {
                    Spacer(modifier = Modifier.width(8.dp))
                }
                ChipComponent(
                    text = bodyTypeValue.text,
                    isSelected = bodyType == bodyTypeValue,
                    maxLines = 1,
                    onClick = {
                        onIntent(SurveyIntent.SelectBodyType(bodyTypeValue))
                    }
                )
            }
        }
    }
} 