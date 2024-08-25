package com.example.appandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF142610)// Color de fondo
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            // Primer contenedor: imagen y textos alineados al centro
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth() // Para que ocupe todo el ancho
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Ícono de Android",
                    modifier = Modifier
                        .size(200.dp) // Tamaño de la imagen
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Ashlee Prevate",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF)
                )

                Text(
                    text = "Android Developer Extraordinaire",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF3DDC84)
                )
            }

            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los contenedores

            // Segundo contenedor: íconos y textos alineados a la izquierda
            Column(
                horizontalAlignment = Alignment.Start, // Alineación a la izquierda
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .wrapContentWidth() // Para que ocupe todo el ancho
                    .padding(top = 16.dp)  // Para que ocupe todo el ancho
            ) {
                // Fila para el número de teléfono
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 8.dp), // Espacio adicional
                    horizontalArrangement = Arrangement.Start // Alineación a la izquierda
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_phone_icon), // Asegúrate de tener el ícono
                        contentDescription = "Número de teléfono",
                        modifier = Modifier.padding(end = 8.dp), // Espacio entre el ícono y el texto
                        tint = Color(0xFF3DDC84)
                    )
                    Text(
                        text = "+51 931 314 730",
                        fontSize = 14.sp,
                        color = Color(0xFFFFFFFF)
                    )
                }

                // Fila para el nombre de usuario
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 8.dp), // Espacio adicional
                    horizontalArrangement = Arrangement.Start // Alineación a la izquierda
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_share_icon), // Asegúrate de tener el ícono
                        contentDescription = "Nombre de usuario",
                        modifier = Modifier.padding(end = 8.dp), // Espacio entre el ícono y el texto
                        tint = Color(0xFF3DDC84)
                    )
                    Text(
                        text = "@copito05",
                        fontSize = 14.sp,
                        color = Color(0xFFFFFFFF)
                    )
                }

                // Fila para el correo electrónico
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 8.dp), // Espacio adicional
                    horizontalArrangement = Arrangement.Start // Alineación a la izquierda
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_email_icon), // Asegúrate de tener el ícono
                        contentDescription = "Correo electrónico",
                        modifier = Modifier.padding(end = 8.dp), // Espacio entre el ícono y el texto
                        tint = Color(0xFF3DDC84)
                    )
                    Text(
                        text = "ashleepre2022@gmail.com", // Corregido el formato del correo
                        fontSize = 14.sp,
                        color = Color(0xFFFFFFFF)
                    )
                }
            }
        }
    }
}
