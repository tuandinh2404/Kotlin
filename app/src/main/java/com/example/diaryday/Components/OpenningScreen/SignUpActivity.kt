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

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import com.example.diaryday.ui.theme.Blue
import com.example.diaryday.ui.theme.Yellow


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
    var text by remember { mutableStateOf("") }

    Box (
    modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)

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


                Box(
                    modifier = Modifier
                        .width(200.dp)
                    ,
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

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )
            @OptIn(ExperimentalMaterial3Api::class)
                    TextField(
                        value = text,
                        onValueChange = {text = it},
                        placeholder = {Text("Nhập email của bạn")},
                        shape = RoundedCornerShape(25.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .width(400.dp)

                    )

            Spacer(
                modifier = Modifier.height(250.dp)
            )
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
                    modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                )
                {
                    Text(
                        text="Tiếp theo",
                        fontSize = 30.sp,
                    )
                    
                }

        }
    }
}
