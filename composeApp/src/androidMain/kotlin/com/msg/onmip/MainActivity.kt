package com.msg.onmip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.ui.Modifier
import com.msg.onmip.feature.survey.SurveyPage
import com.msg.onmip.shared.ui.theme.color.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            SurveyPage(modifier = Modifier.background(White).safeContentPadding())
        }
    }
}