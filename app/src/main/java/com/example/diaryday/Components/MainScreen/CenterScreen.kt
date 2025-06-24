package com.example.diaryday.Components.MainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun CenterScreen(navController: NavController) {
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
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {},
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(start = 10.dp),
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
                    .padding(end = 10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color.Blue
                )
            ) {
                Text(
                    text = ("")
                )
            }

        }
        Row(
            modifier = Modifier
                .width(500.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp)
                .height(60.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Button(
                onClick = {},
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .padding(end = 10.dp),
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
    var items = remember {(1..5).toList()}
    val pagerState = rememberPagerState(pageCount = { items.size })
    VerticalPager (
        state = pagerState,
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(0.dp)
    ) {  page ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .padding(vertical = 5.dp),
                contentAlignment = Alignment.Center
            )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                ) {




                    //Avatar
                    ItemAvatarandUser()
                    Spacer(
                        modifier = Modifier
                            .height(10.dp)
                    )
                    //Item Ảnh
                    ItemImage()
                    Spacer(
                        modifier = Modifier
                            .height(10.dp)
                    )


                    Spacer(
                        modifier = Modifier
                            .height(100.dp)
                    )

                }
            }
        }

    }



@Composable
fun ItemImage() {
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(400.dp)
            .clip(RoundedCornerShape(60.dp))
            .background(Color.Black),
        contentAlignment = Alignment.Center

        )
    {
        Text(
            text = "aduasdghu",
            color = Color.White
        )
    }
}

@Composable
fun ItemAvatarandUser() {
    Row(
        modifier = Modifier
            .width(385.dp),
    )
    {
        //Avatar thay Box thành Image
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.Red)
                .width(50.dp)
                .height(50.dp)
            ,
            contentAlignment = Alignment.Center
        )
        {

        }
        Box(
            modifier = Modifier
                .padding(10.dp)
            ,
            contentAlignment = Alignment.Center
        )
        {
                Text(
                    text = "tên người dung",
                    color = Color.Black,
                    fontSize = 20.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
        }
    }
}
