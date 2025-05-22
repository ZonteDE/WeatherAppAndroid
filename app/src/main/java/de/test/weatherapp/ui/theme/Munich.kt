package de.test.weatherapp.ui.theme

import android.health.connect.datatypes.units.Temperature
import androidx.compose.runtime.Composable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface MunichApi {
    @Get("/v1/forecast?latitude=48.16&longitude=11.53&hourly=temperature_2m&timezone=auto")
    suspend fun getMunich() : MunichItem
}

data class MunichItem(
    val temperature_2m: Int
)

class Munich() {

    private val api = Retrofit.Builder()
        .baseUrl("https://api.open-meteo.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TodoApiService::class.java)
}

@Composable
fun ScreenMunich(){



}