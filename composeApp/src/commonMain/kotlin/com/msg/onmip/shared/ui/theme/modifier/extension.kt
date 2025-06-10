package com.msg.onmip.shared.ui.theme.modifier

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

inline fun Modifier.clickable(
    hideRipple: Boolean = false,
    noinline onClick: () -> Unit,
): Modifier = composed {
    val indication = LocalIndication.current

    clickable(
        indication = if (hideRipple) null else indication,
        interactionSource = remember { MutableInteractionSource() },
        onClick = onClick
    )
}