package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * 날씨 경보 정보
 */
@Serializable
data class WeatherAlert(
    @SerialName("sender_name")
    val senderName: String,
    val event: String,
    val start: Long,
    val end: Long,
    val description: String,
    val tags: List<String>? = null
)
