package de.test.weatherapp.API

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    val hourly: HourlyData
)

data class HourlyData(
    val time: List<String>,
    @SerializedName("temperature_2m") val temperatures: List<Double>,
    val precipitation: List<Double>,
    @SerializedName("weathercode") val weatherCodes: List<Int>
)