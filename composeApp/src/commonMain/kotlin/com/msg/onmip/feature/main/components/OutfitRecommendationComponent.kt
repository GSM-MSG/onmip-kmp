package com.msg.onmip.feature.main.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OutfitRecommendationComponent(
    modifier: Modifier = Modifier,
    items: List<Int> = List(10) { it },
) {
    LazyVerticalGrid(
        modifier = modifier.padding(all = 16.dp).heightIn(max = 1000.dp),
        userScrollEnabled = false,
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items(items.size) {
            OutfitRecommendationItem()
        }
    }
}