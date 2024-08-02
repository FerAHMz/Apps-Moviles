package com.uvg.lab4.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.lab4.ui.theme.Lab4Theme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun Lab4(
    modifier: Modifier = Modifier
) {
    Columnas(modifier = Modifier.fillMaxSize())
}

@Composable
fun Columnas(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Universidad del Valle de Guatemala",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp
                )
            )
        }
        Box(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Programación de plataformas móviles, Sección 30",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 25.sp
                )
            )
        }

        Division1(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        )
        Division2(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        )
        Box(
            modifier = Modifier
                .height(15.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("Fernando Andree Hernández Martínez",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp
                )
            )
        }
        Box(
            modifier = Modifier
                .height(15.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("Número de carné: 23645",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp
                )
            )
        }
    }
}

@Composable
fun Division1(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text("INTEGRANTES",
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(4.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Fernando Rueda", color = Color.Black)
                Text("Juan Martinez", color = Color.Black)
                Text("Fernando Hernandez", color = Color.Black)
            }
        }
    }
}

@Composable
fun Division2(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text("CATEDRÁTICO",
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text("Juan Carlos Durini",
                color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLab4() {
    Lab4Theme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Lab4(
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}