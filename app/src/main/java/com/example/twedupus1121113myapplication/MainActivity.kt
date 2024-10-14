package com.example.twedupus1121113myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twedupus1121113myapplication.ui.theme.Twedupus1121113MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Twedupus1121113MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "吳奕伶",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //var x:Int =0
    var x by remember { mutableStateOf(0) }
    Column {
        Row {
            Button(
                modifier = modifier,
                onClick = {
                    x = 0
                }
            ) {
                Text("歸零")
                Image(
                    painter = painterResource(id = R.drawable.panda1),
                    contentDescription = "Hi",
                    modifier = modifier.size(20.dp)

                )
            }
            Button(
                modifier = modifier,
                onClick = {
                    x *= 2
                }
            ) {
                Text("兩倍")
                Image(
                    painter = painterResource(id = R.drawable.panda1),
                    contentDescription = "Hi",
                    modifier = modifier.size(20.dp)

                )
            }
            Text(text = x.toString(),
                fontSize = 50.sp,
                modifier = modifier.clickable { x++ }
            )
        }



        Row {

            Text(
                text = stringResource(R.string.author),
                color = Color.Blue,
                fontSize = 50.sp,
                fontFamily = FontFamily(Font(R.font.hany)),
                modifier = modifier
            )

            Image(

                painter = painterResource(id = R.drawable.fubao1),

                contentDescription = "可愛小福",
                alpha = 0.8f,
                modifier = modifier.clip(CircleShape)

            )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(

                painter = painterResource(id = R.drawable.fubao),

                contentDescription = "可愛小福",
                alpha = 0.8f,
                modifier = modifier

            )
        }
    }


    @Composable
    fun GreetingPreview() {
        Twedupus1121113MyApplicationTheme {
            Greeting("Android")

        }
    }
}

