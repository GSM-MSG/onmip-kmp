package com.msg.onmip.feature.survey

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import com.msg.onmip.shared.repository.SurveyRepositoryImpl
import com.msg.onmip.feature.survey.viewmodel.SurveyViewModel

@Composable
fun rememberSurveyViewModel(): SurveyViewModel {
    val coroutineScope = rememberCoroutineScope()
    val repository = remember { SurveyRepositoryImpl() }
    
    return remember {
        SurveyViewModel(coroutineScope, repository)
    }
} 