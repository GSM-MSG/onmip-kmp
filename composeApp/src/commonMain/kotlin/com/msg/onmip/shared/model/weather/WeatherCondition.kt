package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable

/**
 * 날씨 상태 정보
 */
@Serializable
data class WeatherCondition(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)
