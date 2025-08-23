package com.msg.onmip.feature.survey.model

data class SurveyState(
    val currentPage: Int = 0,
    val gender: Gender? = null,
    val height: HeightRange? = null,
    val weight: WeightRange? = null,
    val bodyType: BodyType? = null,
    val preferredStyles: Set<PreferredStyle> = emptySet(),
    val isLoading: Boolean = false,
    val error: String? = null,
    val isCompleted: Boolean = false
) 