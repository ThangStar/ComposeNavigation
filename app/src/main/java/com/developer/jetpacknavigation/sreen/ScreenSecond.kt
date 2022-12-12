package com.developer.jetpacknavigation.sreen

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

fun a(){

}
@Composable
fun ScreenSecond(navController: NavController){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(text = "Screen2",
            fontSize = MaterialTheme.typography.h3.fontSize,
            modifier = Modifier.clickable {
                navController.popBackStack()
            })
    }
}
@Composable
@Preview
fun Preview(){
    ScreenSecond(navController = rememberNavController())
}