package com.msg.onmip

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.msg.onmip.di.initKoin
import com.msg.onmip.feature.main.MainScreen

fun main() = application {
    // Koin 초기화
    initKoin()
    
    Window(
        onCloseRequest = ::exitApplication,
        title = "Onmip",
    ) {
        MainScreen()
    }
}