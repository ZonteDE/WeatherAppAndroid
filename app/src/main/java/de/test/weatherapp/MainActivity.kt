package de.test.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.test.weatherapp.screens.ScreenCityWeather
import de.test.weatherapp.screens.ScreenView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "screen_View") {

                composable("screen_View") {
                    ScreenView(navController)
                }

                composable("screen_Munich") {
                    ScreenCityWeather(
                        cityName = "München",
                        latitude = 48.14,
                        longitude = 11.58,
                        navController = navController
                    )
                }

                composable("screen_Berlin") {
                    ScreenCityWeather(
                        cityName = "Berlin",
                        latitude = 52.52,
                        longitude = 13.40,
                        navController = navController
                    )
                }

                composable("screen_Karlsruhe") {
                    ScreenCityWeather(
                        cityName = "Karlsruhe",
                        latitude = 49.01,
                        longitude = 8.40,
                        navController = navController
                    )
                }
            }
        }
    }
}