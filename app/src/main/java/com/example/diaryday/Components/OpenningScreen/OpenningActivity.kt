package com.example.diaryday.Components.OpenningScreen


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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


class OpenningActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OpenningScreenn()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun OpenningScreennPreview() {
    MaterialTheme {
        OpenningScreenn()
    }
}

@Composable
fun OpenningScreenn() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE6521F))  // #E6521F
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(300.dp))

            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFCEF91)), // #FCEF91
                shape = RoundedCornerShape(26.dp),
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

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { /* TODO: Chuyển màn SignUp */ },
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
                onClick = { /* TODO: Chuyển màn Login */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0000FF)), // #0000FF
                shape = RoundedCornerShape(15.dp),
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

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}


