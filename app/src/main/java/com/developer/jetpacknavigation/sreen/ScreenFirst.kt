package com.developer.jetpacknavigation.sreen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.developer.jetpacknavigation.navigate.Screen
import kotlin.coroutines.coroutineContext

@Composable
fun ScreenFirst(navController: NavController, modifier: Modifier = Modifier){
    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center)
     {
        Column() {
            Text(text = "Screen1",
                fontSize = MaterialTheme.typography.h3.fontSize,
                modifier = modifier.clickable {
                    navController.navigate(route = Screen.Second.route)
                }
            )
            var username by remember{
                mutableStateOf("")
            }
            OutlinedTextField(value = username, onValueChange = {
                username = it
            }, modifier = modifier
                .fillMaxWidth(),
                singleLine = true,
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Email, contentDescription = null)
                    }
                },
                label = {
                    Text(text = "Email")
                },
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Info, contentDescription = null)
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                placeholder = {
                    Text(text = "please input your email")
                }
            )
        }
    }
}
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewFirst(){
    ScreenFirst(
        navController = rememberNavController()
    )
}
