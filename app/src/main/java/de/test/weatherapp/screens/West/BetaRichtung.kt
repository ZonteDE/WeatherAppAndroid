package de.test.weatherapp.screens.West

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import de.test.weatherapp.FlexibleButton

@Composable
fun WestScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        FlexibleButton(
            text = "Düsseldorf",
            onClick = { },
            modifier = Modifier
                .width(370.dp)
                .height(90.dp)
                .shadow(5.dp))

       FlexibleButton(
            text = "Montabour",
            onClick = { },
            modifier = Modifier
                .width(370.dp)
                .height(90.dp)
                .shadow(5.dp))

        FlexibleButton(
            text = "Frankfurt",
            onClick = { },
            modifier = Modifier
                .width(370.dp)
                .height(90.dp)
                .shadow(5.dp))

        FlexibleButton(
            text = "Kassel",
            onClick = { },
            modifier = Modifier
                .width(370.dp)
                .height(90.dp)
                .shadow(5.dp))

        FlexibleButton(
            text = "Trier",
            onClick = { },
            modifier = Modifier
                .width(370.dp)
                .height(90.dp)
                .shadow(5.dp))

    }


}

// soll dann den wetter screen aufzeigen von ScreenCityWeather
// buttongröße und Farbe anpassen
// Viewmodel?
//onClick soll zum Düsseldorf führen
@Preview
@Composable
fun PreWest() {
    WestScreen(navController = rememberNavController())
}
