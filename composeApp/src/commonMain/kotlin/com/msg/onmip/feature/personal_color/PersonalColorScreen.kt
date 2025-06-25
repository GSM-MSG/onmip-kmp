package com.msg.onmip.feature.personal_color

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.msg.onmip.feature.personal_color.components.PersonalColorSeparateProgressBar
import com.msg.onmip.feature.personal_color.components.tone.ToneSeparateSection
import com.msg.onmip.shared.ui.components.FilledButton
import com.msg.onmip.shared.ui.components.TopNavigationBar

@Composable
fun PersonalColorScreen() {
    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color.White,
        topBar = {
            TopNavigationBar(
                title = "퍼스널 컬러",
                onBackClick = {}
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            PersonalColorSeparateProgressBar(
                counts = 7,
                currentIndex = 2
            )
            Spacer(modifier = Modifier.height(20.dp))
            ToneSeparateSection(
                title = "내 피부색은 어떤색에 더 가까운가요?",
                colors = listOf(
                    Pair(Color.Red, "빨강"),
                    Pair(Color.Blue, "파랑"),
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            FilledButton(
                text = "다음",
                onClick = {}
            )
        }
    }
}