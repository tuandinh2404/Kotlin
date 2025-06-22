package com.example.diaryday.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Red = Color(0xFFFF0000)
val Orange = Color(0xFFFFA500)
val Yellow = Color(0xFFFFFF00)
val Green = Color(0xFF00FF00)
val Blue = Color(0xFF0000FF)
val Indigo = Color(0xFF4B0082)
val Violet = Color(0xFF8B00FF)

val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)
val Grey = Color(0xFF808080)

// Bạn có thể thêm các màu khác nếu cần
val Pink = Color(0xFFFFC0CB)
val Cyan = Color(0xFF00FFFF)
val Magenta = Color(0xFFFF00FF)
val Brown = Color(0xFFA52A2A)
val DarkGreen = Color(0xFF006400)
val LightBlue = Color(0xFFADD8E6)
val DarkOnPrimary = Color(0xFF000000)



@Immutable
data class AppColors(
    val background : Color,
    val onBackground : Color,
    val surface : Color,
    val onSurface : Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface : Color,
    val onHighlightSurface : Color,
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified,
    )
}

val extenđeColors = AppColors(
    background = Color.White,
    onBackground = Black,
    surface = Color.White,
    onSurface = Black,
    secondarySurface = Pink,
    onSecondarySurface = Color.White,
    regularSurface = Yellow,
    onRegularSurface = Black,
    actionSurface = Yellow,
    onActionSurface = Pink,
    highlightSurface = Green,
    onHighlightSurface = Color.White,
)