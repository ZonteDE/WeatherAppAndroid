package de.test.weatherapp.ui.theme.Karlsruhe

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import de.test.weatherapp.ui.theme.KarlsruheViewModel
import de.test.weatherapp.ui.theme.Munich.MunichRetrofit

@Composable
fun ScreenKarlsruhe(
    navController: NavController,
    viewModel: KarlsruheViewModel
    ) {
    var temperature by remember { mutableStateOf<Double?>(null) }
    var rain by remember { mutableStateOf<Double?>(null) }

    LaunchedEffect(Unit) {
        val data = KarlsruheRetorfit.loadWeather()
        data?.let {
            val currentHour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)
            temperature = it.hourly.temperatures[currentHour]
            rain = it.hourly.precipitation[currentHour]
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Wetter in Karlsruhe", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(12.dp))

        if (temperature != null && rain != null) {
            Text("Temperatur: ${temperature}°C")
            Text("Regen: ${rain} mm")
        } else {
            Text("Lade Wetterdaten...")
        }
        Button(onClick = {navController.popBackStack()
        },
            modifier = Modifier.padding(top = 16.dp)) {
            Text("Zurück")
        }
    }
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        repeat(10) { index ->
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .padding(4.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text("Item $index", color = Color.Red)
            }
         }
    }
}