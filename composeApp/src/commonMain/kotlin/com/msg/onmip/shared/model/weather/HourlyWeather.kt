package com.msg.onmip.shared.model.weather

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * 시간 단위 날씨 예보
 */
@Serializable
data class HourlyWeather(
    val dt: Long,
    val temp: Double,
    @SerialName("feels_like")
    val feelsLike: Double,
    val pressure: Int,
    val humidity: Int,
    @SerialName("dew_point")
    val dewPoint: Double,
    val uvi: Double,
    val clouds: Int,
    val visibility: Int,
    @SerialName("wind_speed")
    val windSpeed: Double,
    @SerialName("wind_deg")
    val windDeg: Int,
    @SerialName("wind_gust")
    val windGust: Double? = null,
    val weather: List<WeatherCondition>,
    val pop: Double
)
