package de.test.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.test.weatherapp.ui.theme.BerlinViewModel
import de.test.weatherapp.ui.theme.Karlsruhe.ScreenKarlsruhe
import de.test.weatherapp.ui.theme.KarlsruheViewModel
import de.test.weatherapp.ui.theme.berlin.ScreenBerlin
import de.test.weatherapp.ui.theme.Munich.ScreenMunich
import de.test.weatherapp.ui.theme.MunichViewModel
import de.test.weatherapp.ui.theme.ScreenView

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
                        val vm: MunichViewModel = viewModel()
                        ScreenMunich(navController, vm)
                    }
                    composable("screen_Berlin") {
                        val vm: BerlinViewModel = viewModel()
                        ScreenBerlin(navController, vm)
                    }
                    composable("screen_Karlsruhe") {
                        val vm : KarlsruheViewModel = viewModel()
                        ScreenKarlsruhe(navController, vm)
                    }
                })
        }
    }
}

