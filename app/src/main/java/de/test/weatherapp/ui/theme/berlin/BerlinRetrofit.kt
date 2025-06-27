package de.test.weatherapp.ui.theme.berlin

import android.util.Log
import de.test.weatherapp.ui.theme.API.WeatherApi
import de.test.weatherapp.ui.theme.API.WeatherResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BerlinRetrofit {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.open-meteo.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: WeatherApi = retrofit.create(WeatherApi::class.java)

    suspend fun loadWeather(): WeatherResponse? {
        return try {
            api.getWeather(52.52, 13.40)
        } catch (e: Exception) {
            Log.e("BerlinRetrofit", "Fehler beim Laden: ${e.message}")
            null
        }
    }
}