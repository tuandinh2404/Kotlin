package com.example.diaryday.Components.OpenningScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.diaryday.ui.theme.Red
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier


@Composable
@Preview( showBackground = true)
fun LoginScreenPreview() {

}

@Composable
fun LoginScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Red)
    ) {

    }

}