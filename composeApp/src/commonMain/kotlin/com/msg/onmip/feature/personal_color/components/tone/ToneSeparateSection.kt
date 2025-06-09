package com.msg.onmip.feature.personal_color.components.tone

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ToneSeparateSection(
    modifier: Modifier = Modifier,
    title: String,
    colors: List<Pair<Color, String>>,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        ToneSeparateSectionHeader(title = title)
        Spacer(modifier = Modifier.height(24.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(colors) { item ->
                ToneSeparateItem(
                    color = item.first,
                    description = item.second
                )
            }
        }
    }
}