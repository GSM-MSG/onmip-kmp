package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * OpenWeather API One Call API 응답 DTO
 */
@Serializable
data class OpenWeatherResponse(
    val lat: Double,
    val lon: Double,
    val timezone: String,
    @SerialName("timezone_offset")
    val timezoneOffset: Int,
    val current: CurrentWeather,
    val minutely: List<MinutelyWeather>? = null,
    val hourly: List<HourlyWeather>? = null,
    val daily: List<DailyWeather>? = null,
    val alerts: List<WeatherAlert>? = null
)
