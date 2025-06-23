package com.example.diaryday.Components.OpenningScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.diaryday.R
import com.example.diaryday.ui.theme.Black
import com.example.diaryday.ui.theme.Red
import com.example.diaryday.ui.theme.Pink
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape


@Composable
@Preview( showBackground = true)
fun RegisterScreenPreview() {
    MaterialTheme {
        RegisterScreen(navController = rememberNavController())
    }
}

@Composable
fun RegisterScreen(
    navController: NavController,
)
{

    Box (
    modifier = Modifier
        .fillMaxSize()
        .background(Pink)

    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxSize()

            ,
            horizontalAlignment = Alignment.CenterHorizontally,

        )
        {
            Spacer(
                modifier = Modifier
                    .height(300.dp)
            )

            Card(
                modifier = Modifier
                    .width(350.dp)
                    .height(100.dp),
                shape = RoundedCornerShape(30.dp),



            )
            {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Red),
                    contentAlignment = Alignment.Center

                )
                {
                    Text(
                        text = ("Email của bạn"),
                        color = Color.White,
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

        }
    }
}
