package com.msg.onmip.shared.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.modifier.clickable
import com.msg.onmip.shared.ui.theme.typography.AppFont
import onmip.composeapp.generated.resources.Res
import onmip.composeapp.generated.resources.ic_arrow_back
import org.jetbrains.compose.resources.painterResource

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String = "",
    leading: @Composable RowScope.() -> Unit = {},
    trailing: @Composable RowScope.() -> Unit = {},
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 20.dp
            ),
    ) {
        Row(
            modifier = Modifier.align(Alignment.CenterStart),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            content = leading
        )
        if (title.isNotEmpty()) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = title,
                style = TextStyle(
                    fontFamily = AppFont(),
                    color = Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Row(
            modifier = Modifier.align(Alignment.CenterEnd),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            content = trailing
        )
    }
}

@Composable
fun TopNavigationBar(
    title: String = "",
    backButtonVisible: Boolean = true,
    onBackClick: () -> Unit = {},
    trailing: @Composable RowScope.() -> Unit = {},
) {
    TopBar(
        title = title,
        leading = {
            if (backButtonVisible) {
                Icon(
                    modifier = Modifier.clickable(onClick = onBackClick),
                    painter = painterResource(Res.drawable.ic_arrow_back),
                    contentDescription = "탑 바 백버튼"
                )
            }
        },
        trailing = trailing
    )
}