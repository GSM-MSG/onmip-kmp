package com.msg.onmip.feature.survey.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.feature.survey.model.PreferredStyle
import com.msg.onmip.feature.survey.model.SurveyIntent
import com.msg.onmip.shared.ui.components.CheckBox
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.White
import com.msg.onmip.shared.ui.theme.typography.AppFont

@Composable
fun StylePreferenceScreen(
    modifier: Modifier = Modifier,
    selectedStyles: Set<PreferredStyle>,
    onIntent: (SurveyIntent) -> Unit,
) {
    Column(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            Text(
                modifier = Modifier.padding(top = 20.dp, bottom = 12.dp),
                text = "선호하는 스타일을 선택해주세요",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = AppFont(),
                color = Black
            )
            // 각 스타일 옵션을 한 줄씩 표시
            PreferredStyle.entries.forEach { style ->
                PreferenceStyleItem(
                    style = style,
                    isSelected = selectedStyles.contains(style),
                    onClick = {
                        onIntent(SurveyIntent.ToggleStyle(style))
                    }
                )
            }
        }
        CTALargeButton(
            modifier = Modifier.padding(vertical = 12.dp).background(White),
            text = if(selectedStyles.isNotEmpty()) "${selectedStyles.size}개 선택" else "선택하기",
            isEnabled = selectedStyles.isNotEmpty(),
            onClick = {
                onIntent(SurveyIntent.NextPage)
            }
        )
    }
}

@Composable
private fun PreferenceStyleItem(
    modifier: Modifier = Modifier,
    style: PreferredStyle,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
            .clickable(
                onClick = onClick,
                indication = null,
                interactionSource = remember { MutableInteractionSource() }),
    ) {
        CheckBox(
            isChecked = isSelected,
            onClick = onClick
        )
        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = style.text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Black,
            modifier = Modifier.weight(1f)
        )
    }
}