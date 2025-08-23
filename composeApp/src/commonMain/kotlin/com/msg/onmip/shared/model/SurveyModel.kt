package com.msg.onmip.shared.model

import com.msg.onmip.feature.survey.model.Gender
import com.msg.onmip.feature.survey.model.HeightRange
import com.msg.onmip.feature.survey.model.WeightRange
import com.msg.onmip.feature.survey.model.BodyType
import com.msg.onmip.feature.survey.model.PreferredStyle

data class SurveyData(
    val gender: Gender,
    val height: HeightRange,
    val weight: WeightRange,
    val bodyType: BodyType,
    val preferredStyles: List<PreferredStyle>
) 