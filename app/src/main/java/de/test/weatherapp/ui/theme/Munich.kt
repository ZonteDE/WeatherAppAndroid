package de.test.weatherapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ScreenMunich() {
    var temperature by remember { mutableStateOf<Double?>(null) }
    var rain by remember { mutableStateOf<Double?>(null) }

    LaunchedEffect(Unit) {
        val data = MunichRetrofit.loadWeather()
        data?.let {
            val currentHour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)
            temperature = it.hourly.temperatures[currentHour]
            rain = it.hourly.precipitation[currentHour]
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Wetter in München", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(12.dp))

        if (temperature != null && rain != null) {
            Text("Temperatur: ${temperature}°C")
            Text("Regen: ${rain} mm")
        } else {
            Text("Lade Wetterdaten...")
        }
    }
}