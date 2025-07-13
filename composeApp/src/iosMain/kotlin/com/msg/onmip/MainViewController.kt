package com.msg.onmip

import androidx.compose.ui.window.ComposeUIViewController
import com.msg.onmip.di.initKoin
import com.msg.onmip.feature.main.MainScreen

fun MainViewController() = ComposeUIViewController {
    // Koin 초기화
    initKoin()
    
    MainScreen()
}