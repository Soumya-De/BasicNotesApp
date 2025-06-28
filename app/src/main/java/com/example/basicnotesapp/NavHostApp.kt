package com.example.basicnotesapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHostApp() {
    val navController = rememberNavController()
    val entries = remember { mutableStateListOf<TextData>() }
    NavHost(navController = navController, startDestination = Routes.ShowData) {
        composable<Routes.EnterData> {
            InputScreen(navController, entries)
        }
        composable<Routes.ShowData> {
            ViewScreen(navController, entries)
        }
    }
}