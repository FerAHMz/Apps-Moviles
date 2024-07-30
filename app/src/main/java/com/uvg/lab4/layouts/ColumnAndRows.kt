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


@Composable
fun Lab4(
    modifier: Modifier = Modifier
) {
    Columnas(modifier)
}

@Composable
fun Columnas(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text("Universidad del Valle de Guatemala", color = MaterialTheme.colorScheme.onPrimary)
        }
        Box(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text("Programación de plataformas móviles, Sección 30", color = MaterialTheme.colorScheme.onPrimary)
        }

        Division1(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        )
        Division2(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        )
        Box(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text("Fernando Andree Hernández Martínez", color = MaterialTheme.colorScheme.onPrimary)
        }
        Box(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text("Número de carné: 23645", color = MaterialTheme.colorScheme.onPrimary)
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
                .weight(1f)
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text("Integrantes", color = MaterialTheme.colorScheme.onPrimary)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(4.dp),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Fernando Rueda", color = MaterialTheme.colorScheme.onPrimary)
                Text("Juan Martinez", color = MaterialTheme.colorScheme.onPrimary)
                Text("Fernando Hernandez", color = MaterialTheme.colorScheme.onPrimary)
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
                .weight(1f)
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text("CATEDRÁTICO", color = MaterialTheme.colorScheme.onPrimary)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)),
            contentAlignment = Alignment.Center
        ) {
            Text("Juan Carlos Durini", color = MaterialTheme.colorScheme.onPrimary)
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