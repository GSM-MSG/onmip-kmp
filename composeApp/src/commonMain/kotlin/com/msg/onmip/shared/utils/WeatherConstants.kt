package com.msg.onmip.shared.utils

/**
 * OpenWeather API 관련 상수들
 */
object WeatherConstants {
    
    /**
     * 날씨 상태 메인 카테고리
     */
    object WeatherMain {
        const val THUNDERSTORM = "Thunderstorm"
        const val DRIZZLE = "Drizzle"
        const val RAIN = "Rain"
        const val SNOW = "Snow"
        const val ATMOSPHERE = "Atmosphere"
        const val CLEAR = "Clear"
        const val CLOUDS = "Clouds"
    }
    
    /**
     * 한국어 날씨 상태 매핑
     */
    val WEATHER_MAIN_KR = mapOf(
        WeatherMain.THUNDERSTORM to "뇌우",
        WeatherMain.DRIZZLE to "이슬비",
        WeatherMain.RAIN to "비",
        WeatherMain.SNOW to "눈",
        WeatherMain.ATMOSPHERE to "안개",
        WeatherMain.CLEAR to "맑음",
        WeatherMain.CLOUDS to "구름"
    )
    
    /**
     * 한국어 날씨 설명 매핑
     */
    val WEATHER_DESCRIPTION_KR = mapOf(
        "thunderstorm with light rain" to "가벼운 비를 동반한 뇌우",
        "thunderstorm with rain" to "비를 동반한 뇌우",
        "thunderstorm with heavy rain" to "폭우를 동반한 뇌우",
        "light thunderstorm" to "가벼운 뇌우",
        "thunderstorm" to "뇌우",
        "heavy thunderstorm" to "강한 뇌우",
        "ragged thunderstorm" to "불규칙한 뇌우",
        "thunderstorm with light drizzle" to "가벼운 이슬비를 동반한 뇌우",
        "thunderstorm with drizzle" to "이슬비를 동반한 뇌우",
        "thunderstorm with heavy drizzle" to "강한 이슬비를 동반한 뇌우",
        
        "light intensity drizzle" to "가벼운 이슬비",
        "drizzle" to "이슬비",
        "heavy intensity drizzle" to "강한 이슬비",
        "light intensity drizzle rain" to "가벼운 이슬비",
        "drizzle rain" to "이슬비",
        "heavy intensity drizzle rain" to "강한 이슬비",
        "shower rain and drizzle" to "소나기와 이슬비",
        "heavy shower rain and drizzle" to "강한 소나기와 이슬비",
        "shower drizzle" to "소나기 이슬비",
        
        "light rain" to "가벼운 비",
        "moderate rain" to "보통 비",
        "heavy intensity rain" to "강한 비",
        "very heavy rain" to "매우 강한 비",
        "extreme rain" to "극심한 비",
        "freezing rain" to "어는 비",
        "light intensity shower rain" to "가벼운 소나기",
        "shower rain" to "소나기",
        "heavy intensity shower rain" to "강한 소나기",
        "ragged shower rain" to "불규칙한 소나기",
        
        "light snow" to "가벼운 눈",
        "Snow" to "눈",
        "Heavy snow" to "강한 눈",
        "Sleet" to "진눈깨비",
        "Light shower sleet" to "가벼운 소나기 진눈깨비",
        "Shower sleet" to "소나기 진눈깨비",
        "Light rain and snow" to "가벼운 비와 눈",
        "Rain and snow" to "비와 눈",
        "Light shower snow" to "가벼운 소나기 눈",
        "Shower snow" to "소나기 눈",
        "Heavy shower snow" to "강한 소나기 눈",
        
        "mist" to "안개",
        "Smoke" to "연기",
        "Haze" to "실안개",
        "sand/ dust whirls" to "모래/먼지 회오리",
        "fog" to "안개",
        "sand" to "모래",
        "dust" to "먼지",
        "volcanic ash" to "화산재",
        "squalls" to "돌풍",
        "tornado" to "토네이도",
        
        "clear sky" to "맑음",
        
        "few clouds" to "약간의 구름",
        "scattered clouds" to "산발적인 구름",
        "broken clouds" to "부분적으로 흐림",
        "overcast clouds" to "흐림"
    )
    
    /**
     * 온도 단위
     */
    object TemperatureUnit {
        const val CELSIUS = "°C"
        const val FAHRENHEIT = "°F"
        const val KELVIN = "K"
    }
    
    /**
     * 풍속 단위
     */
    object WindSpeedUnit {
        const val MS = "m/s"
        const val KMH = "km/h"
        const val MPH = "mph"
        const val KNOTS = "knots"
    }
    
    /**
     * API 엔드포인트
     */
    object ApiEndpoint {
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
        const val ONE_CALL = "onecall"
    }
    
    /**
     * API 파라미터
     */
    object ApiParams {
        const val LAT = "lat"
        const val LON = "lon"
        const val APPID = "appid"
        const val UNITS = "units"
        const val LANG = "lang"
        const val EXCLUDE = "exclude"
    }
    
    /**
     * 단위 시스템
     */
    object Units {
        const val STANDARD = "standard"
        const val METRIC = "metric"
        const val IMPERIAL = "imperial"
    }
    
    /**
     * 언어 코드
     */
    object Language {
        const val KOREAN = "kr"
        const val ENGLISH = "en"
    }
}
