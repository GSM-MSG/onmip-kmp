package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable

/**
 * 일별 체감온도 정보
 */
@Serializable
data class DailyFeelsLike(
    val day: Double,
    val night: Double,
    val eve: Double,
    val morn: Double
)
