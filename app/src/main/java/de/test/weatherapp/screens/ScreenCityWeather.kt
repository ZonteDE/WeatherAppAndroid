package de.test.weatherapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import de.test.weatherapp.viewmodel.CityWeatherViewModel

@Composable
fun ScreenCityWeather(
    cityName: String,
    latitude: Double,
    longitude: Double,
    navController: NavController,
    viewModel: CityWeatherViewModel = viewModel()
) {
    val temperature by viewModel.temperature.collectAsState()
    val rain by viewModel.rain.collectAsState()

    LaunchedEffect(cityName) {
        viewModel.loadWeather(latitude, longitude)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB))
    ) {
        Text(
            cityName,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding()
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(12.dp))

        if (temperature != null && rain != null) {
            Text("Temperatur: ${temperature}°C")
            Text("Regen: ${rain} mm")
        } else {
            Text("Lade Wetterdaten...")
        }

        Button(onClick = {navController.popBackStack()}) {
            Text("Zurück")
        }

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            repeat(10) { index ->
                Box(modifier = Modifier
                    .size(100.dp)
                    .padding(15.dp)
                    .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Wetter")
                }
            }
        }
    }
}