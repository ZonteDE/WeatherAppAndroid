package de.test.weatherapp.ui.theme.berlin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@Composable
fun ScreenBerlin(navController: NavController) {
    var temperature by remember { mutableStateOf<Double?>(null) }
    var rain by remember { mutableStateOf<Double?>(null) }

    LaunchedEffect(Unit) {
        val data = BerlinRetrofit.loadWeather()
        data?.let {
            val currentHour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)
            temperature = it.hourly.temperatures[currentHour]
            rain = it.hourly.precipitation[currentHour]
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Wetter in Berlin", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(12.dp))

        if (temperature != null && rain != null) {
            Text("Temperatur: ${temperature}°C")
            Text("Regen: ${rain}mm")
        } else {
            Text("Lade Wetterdaten...")
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Zurück")
        }
    }
}