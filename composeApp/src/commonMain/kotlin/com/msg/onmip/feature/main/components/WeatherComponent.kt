package com.msg.onmip.feature.main.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherComponent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        WeatherItem(modifier = Modifier.padding(vertical = 12.dp, horizontal = 16.dp))
        WeatherItem(modifier = Modifier.padding(vertical = 12.dp, horizontal = 16.dp))
    }
}