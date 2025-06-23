package com.example.diaryday.Components.OpenningScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
            .background(Color(0xFF7C432F))  // #E6521F
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier
                .height(300.dp))

            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFCEF91)), // #FCEF91
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .wrapContentWidth()
                    .height(100.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Chia sẻ những khoảnh khắc đến với bạn bè của bạn",
                        color = Color.Black,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Spacer(modifier = Modifier
                .weight(1f))

            Button(
                onClick = {navController.navigate("RegisterScreen")},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE5989B)), // #E5989B
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .width(250.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "Tạo một tài khoản",
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {navController.navigate("LoginScreen")},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0000FF)),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(250.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "Đăng nhập",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}


