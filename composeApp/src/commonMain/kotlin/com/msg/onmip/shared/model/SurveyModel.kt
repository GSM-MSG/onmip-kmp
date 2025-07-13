package com.msg.onmip.shared.model

data class SurveyData(
    val gender: String,
    val height: Int,
    val weight: Int,
    val bodyType: String,
    val preferredStyles: List<String>
) 