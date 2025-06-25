package de.test.weatherapp.ui.theme.Munich

import android.util.Log
import de.test.weatherapp.ui.theme.API.WeatherApi
import de.test.weatherapp.ui.theme.API.WeatherResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MunichRetrofit {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.open-meteo.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: WeatherApi = retrofit.create(WeatherApi::class.java)

    suspend fun loadWeather(): WeatherResponse? {
        return try {
            api.getWeather(48.14, 11.58)
        } catch (e: Exception) {
            Log.e("MunichRetrofit", "Fehler beim Laden: ${e.message}")
            null
        }
    }
}