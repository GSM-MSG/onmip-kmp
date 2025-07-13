package com.msg.onmip.feature.survey.model

sealed class SurveyIntent {
    data object NextPage : SurveyIntent()
    data object PreviousPage : SurveyIntent()
    data class SelectGender(val gender: String) : SurveyIntent()
    data class UpdateHeight(val height: String) : SurveyIntent()
    data class UpdateWeight(val weight: String) : SurveyIntent()
    data class SelectBodyType(val bodyType: String) : SurveyIntent()
    data class ToggleStyle(val style: String) : SurveyIntent()
    data object SubmitSurvey : SurveyIntent()
} 