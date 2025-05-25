package com.msg.onmip.feature.main.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WeatherComponent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        WeatherItem()
        WeatherItem()
    }
}