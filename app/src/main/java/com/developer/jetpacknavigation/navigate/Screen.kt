package com.developer.jetpacknavigation.navigate

sealed class Screen(val route: String){
    object First: Screen(route = "first_screen")
    object Second: Screen(route = "second_screen")
}
