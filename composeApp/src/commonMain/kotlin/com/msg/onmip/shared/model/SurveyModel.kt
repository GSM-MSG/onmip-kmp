package com.msg.onmip.shared.model

import com.msg.onmip.feature.survey.model.Gender
import com.msg.onmip.feature.survey.model.HeightRange

data class SurveyData(
    val gender: Gender,
    val height: HeightRange,
    val weight: Int,
    val bodyType: String,
    val preferredStyles: List<String>
) 