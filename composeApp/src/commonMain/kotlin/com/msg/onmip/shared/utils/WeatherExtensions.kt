package com.msg.onmip.shared.utils

import com.msg.onmip.shared.model.weather.*
import kotlin.math.roundToInt

/**
 * 온도를 켈빈에서 섭씨로 변환
 */
fun Double.kelvinToCelsius(): Double = this - 273.15

/**
 * 온도를 켈빈에서 화씨로 변환
 */
fun Double.kelvinToFahrenheit(): Double = (this - 273.15) * 9/5 + 32

/**
 * 온도를 섭씨로 변환하고 정수로 반올림
 */
fun Double.kelvinToCelsiusInt(): Int = kelvinToCelsius().roundToInt()

/**
 * 온도를 화씨로 변환하고 정수로 반올림
 */
fun Double.kelvinToFahrenheitInt(): Int = kelvinToFahrenheit().roundToInt()

/**
 * 풍속을 m/s에서 km/h로 변환
 */
fun Double.msToKmh(): Double = this * 3.6

/**
 * 풍속을 m/s에서 km/h로 변환하고 정수로 반올림
 */
fun Double.msToKmhInt(): Int = msToKmh().roundToInt()

/**
 * Unix timestamp를 한국어 날짜 형식으로 변환
 */
fun Long.toKoreanDate(): String {
    val date = java.util.Date(this * 1000)
    val formatter = java.text.SimpleDateFormat("MM월 dd일")
    return formatter.format(date)
}

/**
 * Unix timestamp를 한국어 시간 형식으로 변환
 */
fun Long.toKoreanTime(): String {
    val date = java.util.Date(this * 1000)
    val formatter = java.text.SimpleDateFormat("HH:mm")
    return formatter.format(date)
}

/**
 * Unix timestamp를 한국어 요일로 변환
 */
fun Long.toKoreanDayOfWeek(): String {
    val date = java.util.Date(this * 1000)
    val formatter = java.text.SimpleDateFormat("E요일")
    return formatter.format(date)
}

/**
 * 기압을 hPa에서 표시 가능한 문자열로 변환
 */
fun Int.toPressureString(): String = "${this} hPa"

/**
 * 습도를 퍼센트 문자열로 변환
 */
fun Int.toHumidityString(): String = "${this}%"

/**
 * 가시거리를 km로 변환하여 문자열로 반환
 */
fun Int.toVisibilityString(): String = "${this / 1000}km"

/**
 * 자외선 지수를 레벨 문자열로 변환
 */
fun Double.toUviLevel(): String {
    return when {
        this <= 2 -> "낮음"
        this <= 5 -> "보통"
        this <= 7 -> "높음"
        this <= 10 -> "매우 높음"
        else -> "위험"
    }
}

/**
 * 날씨 아이콘 URL을 생성
 */
fun String.toWeatherIconUrl(): String = "https://openweathermap.org/img/wn/${this}@2x.png"

/**
 * 강수 확률을 퍼센트 문자열로 변환
 */
fun Double.toPopString(): String = "${(this * 100).toInt()}%"
