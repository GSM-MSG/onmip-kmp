package com.msg.onmip.feature.survey

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.msg.onmip.feature.survey.viewmodel.SurveyViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object SurveyViewModelProvider : KoinComponent {
    val viewModel: SurveyViewModel by inject()
}

@Composable
fun rememberSurveyViewModel(): SurveyViewModel {
    return remember { SurveyViewModelProvider.viewModel }
} 