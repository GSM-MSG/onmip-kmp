package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * 일 단위 날씨 예보
 */
@Serializable
data class DailyWeather(
    val dt: Long,
    val sunrise: Long,
    val sunset: Long,
    val moonrise: Long,
    val moonset: Long,
    @SerialName("moon_phase")
    val moonPhase: Double,
    val summary: String? = null,
    val temp: DailyTemperature,
    @SerialName("feels_like")
    val feelsLike: DailyFeelsLike,
    val pressure: Int,
    val humidity: Int,
    @SerialName("dew_point")
    val dewPoint: Double,
    @SerialName("wind_speed")
    val windSpeed: Double,
    @SerialName("wind_deg")
    val windDeg: Int,
    @SerialName("wind_gust")
    val windGust: Double? = null,
    val weather: List<WeatherCondition>,
    val clouds: Int,
    val pop: Double,
    val rain: Double? = null,
    val snow: Double? = null,
    val uvi: Double
)
