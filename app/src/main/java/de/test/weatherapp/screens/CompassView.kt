package de.test.weatherapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import de.test.weatherapp.viewmodel.CityWeatherViewModel

@Composable
fun CompassView(
    navController: NavController,
    viewModel: CityWeatherViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { }, modifier = Modifier
            .width(370.dp)
            .height(90.dp)
            .shadow(5.dp, shape = RoundedCornerShape(16.dp))
        )
        {
            Text("West")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { },modifier = Modifier
            .width(370.dp)
            .height(90.dp)
            .shadow(5.dp, shape = RoundedCornerShape(16.dp))
        ) {
            Text("Nord")


        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { },modifier = Modifier
            .width(370.dp)
            .height(90.dp)
            .shadow(5.dp, shape = RoundedCornerShape(16.dp))
        ) {
            Text("Ost")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { },modifier = Modifier
            .width(370.dp)
            .height(90.dp)
            .shadow(5.dp, shape = RoundedCornerShape(16.dp))
        ) {
            Text("Süd")
        }
    }
}
/*
@Composable
@Preview
fun PrevCompass() {
    CompassView()
}

 */