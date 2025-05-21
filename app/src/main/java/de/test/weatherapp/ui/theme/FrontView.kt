package de.test.weatherapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB)),
    )    {
         Box(modifier = Modifier                    //    Text: Weather
             .offset( x = 11.dp, y = 100.dp)) {
             Text(text = "Weather", fontSize = 30.sp,
                 color = Color.White) }
        Box {                                       //      Button: Munich
            Button(onClick = { },
                modifier = Modifier
                    .width(370.dp)
                    .height(90.dp)
                    .offset(x = 11.dp, y = 170.dp)
                    .shadow(5.dp, shape = RoundedCornerShape(16.dp))
                )   {
                Text("Munich",  )

            }
            Box {                                       //      Button: Munich
                Button(onClick = { },
                    modifier = Modifier
                        .width(470.dp)
                        .height(90.dp)
                        .offset(x = 11.dp, y = 170.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(16.dp))
            }
        }
    }
}

@Preview
@Composable
fun PrevApp() {
    ScreenView()
}