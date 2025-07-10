package de.test.weatherapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB)),
    ) {
        Box(
            modifier = Modifier                    //    Text: Weather
                .offset(x = 11.dp, y = 100.dp)
        ) {
            Text(
                text = "Weather", fontSize = 30.sp,
                color = Color.White
            )
        }
        Box {                                       //      Button: Munich
            Button(
                onClick = {
                    navController.navigate("screen_Munich")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF64B5F6)),
                modifier = Modifier
                    .width(370.dp)
                    .height(90.dp)
                    .offset(x = 11.dp, y = 170.dp)
                    .shadow(
                        5.dp, shape = RoundedCornerShape(16.dp))
            ) {
                Text("Munich",)

            }
        }
        Box {                                       //      Button: Berlin
            Button(
                onClick = {
                    navController.navigate("screen_Berlin")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF64B5F6)),
                modifier = Modifier
                    .width(370.dp)
                    .height(90.dp)
                    .offset(x = 11.dp, y = 180.dp)
                    .shadow(5.dp, shape = RoundedCornerShape(16.dp))
            ) {
                Text("Berlin")
            }
        }
        Box {                                       //      Button: Karlsruhe
            Button(
                onClick = {
                    navController.navigate("screen_Karlsruhe")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF64B5F6)),
                modifier = Modifier
                    .width(370.dp)
                    .height(90.dp)
                    .offset(x = 11.dp, y = 190.dp)
                    .shadow(5.dp, shape = RoundedCornerShape(16.dp))
            ) {
                Text("Karlsruhe")
            }
        }
    }
}

@Preview
@Composable
fun PrevApp() {
    ScreenView(navController = rememberNavController())
}