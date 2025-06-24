package com.example.diaryday.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.diaryday.Components.MainScreen.CenterScreen
import com.example.diaryday.Components.OpenningScreen.LoginScreen
import com.example.diaryday.Components.OpenningScreen.OpenningScreen
import com.example.diaryday.Components.OpenningScreen.RegisterScreen
@Composable
fun Stack(navController: NavHostController) {
    NavHost(
        navController =  navController,
        startDestination = "SplashScreen"
    ) {
        composable("SplashScreen") {
            OpenningScreen(navController)
        }
        composable("RegisterScreen") {
            RegisterScreen(navController)
        }
        composable("LoginScreen") {
            LoginScreen(navController)
        }
        composable("CenterScreen") {
            CenterScreen(navController)
        }


    }
}