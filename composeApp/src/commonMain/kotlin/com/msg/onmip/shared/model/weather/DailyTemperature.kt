package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable

/**
 * 일별 온도 정보
 */
@Serializable
data class DailyTemperature(
    val day: Double,
    val min: Double,
    val max: Double,
    val night: Double,
    val eve: Double,
    val morn: Double
)
