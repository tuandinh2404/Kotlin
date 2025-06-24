package com.example.diaryday.Components.OpenningScreen

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.runtime.getValue
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController




@Preview(showBackground = true)
@Composable
fun OpenningScreenPreview() {
    MaterialTheme {
        OpenningScreen(navController = rememberNavController())
    }

}

@Composable
fun OpenningScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)  // #E6521F
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier
                    .height(300.dp)
            )


            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Chia sẻ khoảnh khắc đến bạn bè của bạn",
                    color = Color.White,
                    fontSize = 35.sp,
                    textAlign = TextAlign.Center
                )

            }

            Spacer(
                modifier = Modifier
                    .weight(1f)
            )

                ButtonRegister(navController =navController)

                Spacer(
                    modifier = Modifier
                        .weight(0.1f)
                )
                ButtonLogin(navController = navController)

                Spacer(modifier = Modifier.height(100.dp))


        }
    }
}


@Composable
fun ButtonRegister(
    navController: NavController
) {
    val interactionSource = remember { MutableInteractionSource() }
    val presend by interactionSource.collectIsPressedAsState()
    val width by animateDpAsState(targetValue =  if (presend) 345.dp else 350.dp)
    val height by animateDpAsState(targetValue =  if (presend) 58.dp else 60.dp)
    val alpha by animateDpAsState(targetValue = if(presend) 0.9. dp else 1.dp)

    Box(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("RegisterScreen") },
            interactionSource = interactionSource,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE5989B)), // #E5989B

            modifier = Modifier
                .width(width)
                .height(height)
                .alpha(if(presend) 0.9f else 1f)
                .border(
                    width =2.dp,
                    color = Color(0xFFE5989B),
                    shape = RoundedCornerShape(30.dp)
                )
        ) {
            Text(
                text = "Tạo một tài khoản",
                fontSize = 16.sp
            )
        }
    }
}
@Composable
fun ButtonLogin(navController: NavController) {
    val interactionSource = remember { MutableInteractionSource() }
    val presend by interactionSource.collectIsPressedAsState()
    val width by animateDpAsState(targetValue =  if (presend) 345.dp else 350.dp)
    val height by animateDpAsState(targetValue =  if (presend) 58.dp else 60.dp)
    val alpha by animateDpAsState(targetValue = if (presend) 0.8.dp else 1.dp)
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                navController.navigate("LoginScreen")
            },
            interactionSource = interactionSource,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .width(width)
                .height(height)
                .border(
                    width = 2.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(30.dp)
                )
                .alpha(if (presend) 0.8f else 1f)
        ) {
            Text(
                text = "Đăng nhập",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}


