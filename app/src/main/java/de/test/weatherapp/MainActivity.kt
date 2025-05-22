package de.test.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.F
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.test.weatherapp.ui.theme.ScreenMunich
import de.test.weatherapp.ui.theme.ScreenView
import de.test.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //WeatherAppTheme {
                //ScreenView()
                val navController = rememberNavController()
                NavHost(navController= navController , startDestination =  "screen_View", builder = {
                    composable("screen_View") {
                        ScreenView(navController)
                    }
                    composable("screen_Munich") {
                        ScreenMunich()
                    }

                })
            }
        }
    }

