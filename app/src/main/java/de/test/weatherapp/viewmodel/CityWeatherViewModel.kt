package de.test.weatherapp.viewmodel

import android.icu.util.Calendar
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.test.weatherapp.Retrofit.WeatherRetrofit
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CityWeatherViewModel : ViewModel() {

    private val _temperature = MutableStateFlow<Double?>(null)
    val temperature: StateFlow<Double?> = _temperature

    private val _rain = MutableStateFlow<Double?>(null)
    val rain: StateFlow<Double?> = _rain

    private var hasLoaded = false

    fun loadWeather(latitude: Double, longitude: Double) {
        if (hasLoaded) return
        hasLoaded = true
        viewModelScope.launch {
            val data = WeatherRetrofit.loadWeather(latitude, longitude)
            data?.let {
                val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
                _temperature.value = it.hourly.temperatures[currentHour]
                _rain.value = it.hourly.precipitation[currentHour]
            }
        }
    }
}