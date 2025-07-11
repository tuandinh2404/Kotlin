package com.example.diaryday.Components.OpenningScreen

import android.widget.Space
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
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
@Preview(showBackground = true)
fun RegisterScreenPreview() {

    MaterialTheme {
        RegisterScreen(navController = rememberNavController())
    }
}

@Composable
fun RegisterScreen(
    navController: NavController,
) {
    var step by remember { mutableStateOf(1) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val interactionSource = remember { MutableInteractionSource() }
    val presend by interactionSource.collectIsPressedAsState()
    val width by animateDpAsState(targetValue =  if (presend) 365.dp else 370.dp)
    val height by animateDpAsState(targetValue =  if (presend) 60.dp else 65.dp)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)


    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {

            Spacer(
                modifier = Modifier
                    .weight(1f)
            )
            //Nhập email đây
            Crossfade(targetState = step, animationSpec = tween(1000)) { step ->
                when (step) {
                    1 -> CreateEmailAccount(
                        text = email,
                        onValueChange = { email = it },
                    )
                    //Nhập Password
                    2 -> CreatePasswordAccount(
                        text = password,
                        onValueChange = { password = it }
                    )

                }
            }

            Spacer(
                modifier = Modifier.weight(1f)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .imePadding()
                    .height(200.dp)
                    .padding(bottom = 36.dp)
                ,
                contentAlignment = Alignment.Center
            )
            {

                Button(
                    onClick = {
                        if (step < 2) {
                            step++
                        } else {
                            // Đến màn tiếp theo hoặc xử lý đăng ký
                            // navController.navigate("NextScreen")
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
                    interactionSource = interactionSource,
                    modifier = Modifier
                        .width(width)
                        .height(height)
                        .border(
                            width = 2.dp,
                            color = Color.Yellow,
                            shape = RoundedCornerShape(60.dp)
                        )

                )
                {
                    Text(
                        text = "Tiếp theo",
                        fontSize = 30.sp,
                        color = Color.Black
                    )
                }
                Spacer(
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                )
            }
        }
    }
}

@Composable
fun CreateEmailAccount(
    text: String,
    onValueChange: (String) -> Unit
) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
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
            onValueChange = { onValueChange(it) },
            placeholder = { Text("Nhập email của bạn") },
            shape = RoundedCornerShape(25.dp),
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .width(400.dp)

        )
    }
}

@Composable
fun CreatePasswordAccount(
    text: String,
    onValueChange: (String) -> Unit
    ) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center

        )
        {
            Text(
                text = ("Mật khẩu của bạn"),
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
            onValueChange = { onValueChange(it) },
            placeholder = { Text("Nhập mật khẩu của bạn") },
            shape = RoundedCornerShape(25.dp),
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .width(400.dp)

        )
    }
}

