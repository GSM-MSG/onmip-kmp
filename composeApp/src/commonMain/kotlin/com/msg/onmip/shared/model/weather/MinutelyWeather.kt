package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable

/**
 * 분 단위 날씨 예보
 */
@Serializable
data class MinutelyWeather(
    val dt: Long,
    val precipitation: Double
)
