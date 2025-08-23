package com.msg.onmip.feature.survey.model

sealed class SurveyEffect {
    data class NavigateToPage(val page: Int) : SurveyEffect()
    data object ShowLoading : SurveyEffect()
    data object HideLoading : SurveyEffect()
    data class ShowError(val message: String) : SurveyEffect()
    data object SurveyCompleted : SurveyEffect()
    data object ExitSurvey : SurveyEffect()
} 