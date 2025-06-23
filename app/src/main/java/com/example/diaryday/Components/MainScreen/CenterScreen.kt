package com.example.diaryday.Components.MainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CenterScreen(navController: NavController)
    {
    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()

    )
    {
        //component ở dưới
        LazyCollum()
        //}
            Row(
                modifier = Modifier
                    .width(500.dp)
                    .align(Alignment.TopCenter)
                    .padding(top = 40.dp)
                    .height(60.dp)
                ,
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(70.dp)
                        .height(60.dp)
                        .padding(start = 10.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(
                        Color.Blue
                    )
                ) {
                    Text(
                        text = ("")
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(70.dp)
                        .height(60.dp)
                        .padding(end = 10.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(
                        Color.Blue
                    )
                ) {
                    Text(
                        text = ("")
                    )
                }

            }
    }
}

@Composable
fun LazyCollum() {
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),

        contentPadding = PaddingValues(
            top = screenHeight / 7,
            bottom = 16.dp
        )
    ) {
        items(5) { index ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .padding(vertical = 8.dp)
                ,
                contentAlignment = Alignment.Center
            )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .width(385.dp)
                            .height(60.dp)
                        ,
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(25.dp))
                                .background(Color.Red)
                                .width(50.dp)
                                .height(50.dp)
                                .padding(20.dp)
                            ,
                        )
                        {

                        }
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                            ,
                            contentAlignment = Alignment.Center
                        )
                        {
                            Column(

                            ) {



                                Text(
                                    text = "tên",
                                    color = Color.Black,
                                    fontSize = 20.sp
                                )
                                Text(
                                    text = "uid",
                                    color = Color.Black
                                )
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.95f)
                            .height(400.dp)
                            .clip(RoundedCornerShape(26.dp))
                            .background(Color.Black)
                            .padding(20.dp),

                        )
                    {
                        Text(
                            text = "aduasdghu",
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}