package de.test.weatherapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import de.test.weatherapp.viewmodel.CityWeatherViewModel

@Composable
fun CompassView(
   /* cityName: String,
    latitude: Double,
    longitude: Double,
    navController: NavController,
    viewModel: CityWeatherViewModel = viewModel() */
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB))
    ) {
        Spacer(modifier = Modifier.height(100.dp))
    }
    Button(onClick = { }) {
        Text("West")
    }
    Spacer(modifier = Modifier.height(16.dp))

    Button(onClick =  { }) {
        Text("Nord")
    }
}

@Composable
@Preview
fun PrevCompas() {
    CompassView()
}