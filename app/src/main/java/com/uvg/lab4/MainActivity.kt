package com.uvg.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.lab4.background.BackgroundScreen
import com.uvg.lab4.layouts.Lab4
import com.uvg.lab4.ui.theme.Lab4Theme

@Composable
fun BackgroundWithContent(opacity: Float, content: @Composable () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundScreen(opacity = opacity)
        content()
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BackgroundWithContent(opacity = 0.5f) {
                        Lab4(
                                modifier = Modifier
                                    .padding(innerPadding)
                                    .padding(8.dp)
                                    .fillMaxSize()
                            )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Lab4PreviewWithBackground() {
    Lab4Theme {
        BackgroundWithContent(opacity = 0.1f) {
            Lab4()
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun Lab4Preview() {
//    Lab4Theme {
//        Lab4()
//    }
//}