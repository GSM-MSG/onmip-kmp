package com.msg.onmip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.ui.Modifier
import com.msg.onmip.di.initKoin
import com.msg.onmip.feature.survey.SurveyPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Koin 초기화
        initKoin()

        setContent {
            SurveyPage(modifier = Modifier.safeContentPadding())
        }
    }
}