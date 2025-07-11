package de.test.weatherapp.Retrofit

import android.util.Log
import de.test.weatherapp.API.WeatherApi
import de.test.weatherapp.API.WeatherResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherRetrofit {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.open-meteo.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api: WeatherApi = retrofit.create(WeatherApi::class.java)

    suspend fun loadWeather(latitude: Double, longitude: Double): WeatherResponse? {
        return try {
            api.getWeather(latitude, longitude)
        } catch (e: Exception) {
            Log.e("WeatherRetrofit", "Fehler beim Laden: ${e.message}")
            null
        }
    }
}

//Reftrofit für alle Städte