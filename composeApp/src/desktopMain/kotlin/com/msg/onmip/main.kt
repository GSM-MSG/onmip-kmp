package com.msg.onmip

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.msg.onmip.feature.main.MainScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Onmip",
    ) {
        MainScreen()
    }
}