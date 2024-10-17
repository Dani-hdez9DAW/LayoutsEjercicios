package com.example.layoutsejercicios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutsejercicios.ui.theme.LayoutsEjerciciosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutsEjerciciosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutsEjerciciosTheme {
        Greeting("Android")
    }
}
@Preview
@Composable
fun ejercicio1(modifier: Modifier = Modifier) {
    val Purple40 = Color(0xFF6650a4)

    Surface(
        modifier = modifier,
        color = Purple40
    ) {
        Box(
            modifier = Modifier.fillMaxSize() // Ajustar el tamaño del Box si es necesario
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .align(Alignment.Center)
            ) {
                Text(
                    text = "Hola Mundo",
                    color = Color.White
                )
            }
        }
    }
}


@Preview
@Composable
fun ejercicio2(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = modifier
                .size(100.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(75.dp)
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Green)
                        .align(Alignment.Center)
                )
            }
        }
    }

}

@Preview
@Composable
fun ejercicio2b(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.size(200.dp)
    ) {
        // Box verde que cubre el 70% del ancho
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(0.7f)
                .background(Color.Green)
        )

        // Box rojo que cubre el 30% del ancho
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(0.3f)
                .background(Color.Red)
        )
    }
}