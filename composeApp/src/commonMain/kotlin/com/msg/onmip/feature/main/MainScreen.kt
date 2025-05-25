package com.msg.onmip.feature.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.msg.onmip.feature.main.components.ColorRecommendationComponent
import com.msg.onmip.feature.main.components.ListHeader
import com.msg.onmip.feature.main.components.MainAppBar
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
        MainAppBar(
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 8.dp
            )
        )
        ListHeader(
            title = "날씨",
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        WeatherComponent()
        ListHeader(
            title = "추천 색상",
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        ColorRecommendationComponent(modifier = Modifier.padding(all = 16.dp))
        ListHeader(
            title = "추천",
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        OutfitRecommendationComponent(modifier = Modifier.padding(all = 16.dp))
    }
}