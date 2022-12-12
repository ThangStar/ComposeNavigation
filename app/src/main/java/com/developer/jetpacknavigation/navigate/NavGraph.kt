package com.developer.jetpacknavigation.navigate

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.developer.jetpacknavigation.sreen.ScreenFirst
import com.developer.jetpacknavigation.sreen.ScreenSecond

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController,
    startDestination = Screen.First.route
    ){
        composable(
            route = Screen.First.route
        ){
            ScreenFirst(navController = navController, modifier = Modifier.padding(horizontal = 20.dp))
        }

        composable(
            route = Screen.Second.route
        ){
            ScreenSecond(navController = navController)
        }
    }
}
