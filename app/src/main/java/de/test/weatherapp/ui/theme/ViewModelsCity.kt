package de.test.weatherapp.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MunichViewModel : ViewModel() {
    val cityName = MutableStateFlow("München")
}
class BerlinViewModel : ViewModel() {
    val cityName = MutableStateFlow("Berlin")
}
class KarlsruheViewModel : ViewModel() {
    val cityName = MutableStateFlow("Karlsruhe")
}