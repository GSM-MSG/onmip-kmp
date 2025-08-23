package com.msg.onmip.feature.survey.model

sealed class SurveyIntent {
    data object NextPage : SurveyIntent()
    data object PreviousPage : SurveyIntent()
    data class SelectGender(val gender: Gender) : SurveyIntent()
    data class UpdateHeight(val height: HeightRange) : SurveyIntent()
    data class UpdateWeight(val weight: WeightRange) : SurveyIntent()
    data class SelectBodyType(val bodyType: BodyType) : SurveyIntent()
    data class ToggleStyle(val style: PreferredStyle) : SurveyIntent()
    data object SubmitSurvey : SurveyIntent()
    data object HandleBackPress : SurveyIntent()
} 