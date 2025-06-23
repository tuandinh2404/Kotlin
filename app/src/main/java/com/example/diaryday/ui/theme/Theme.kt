package com.example.diaryday.ui.theme


import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun DiaryDayTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalAppColors provides extendeColors) {
        MaterialTheme(
            content = content
        )
    }

}

object  DiaryDayTheme{
    val colors: AppColors
        @Composable
        get() = LocalAppColors.current
}