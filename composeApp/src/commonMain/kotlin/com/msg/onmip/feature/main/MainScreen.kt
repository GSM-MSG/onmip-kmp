package com.msg.onmip.feature.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.msg.onmip.feature.main.components.ListHeader
import com.msg.onmip.feature.main.components.MainAppBar
import com.msg.onmip.feature.main.components.ColorRecommendationComponent
import com.msg.onmip.feature.main.components.OutfitRecommendationComponent
import com.msg.onmip.feature.main.components.WeatherComponent
import com.msg.onmip.shared.ui.theme.color.White

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = White)
            .verticalScroll(rememberScrollState())
    ) {
        MainAppBar()
        ListHeader(title = "날씨")
        WeatherComponent()
        ListHeader(title = "추천 색상")
        ColorRecommendationComponent()
        ListHeader(title = "추천")
        OutfitRecommendationComponent()
    }
}