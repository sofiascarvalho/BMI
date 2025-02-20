package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) { //funcao de composicao (sempre com letra maiuscula) que diz que vamos fazer composicao de tela
    Box(
        modifier = Modifier
            .fillMaxSize() //do tamanho maximo dentro do pai, ou seja, do celular
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xff4B0082),
                        Color(0xff8A2BE2)
                    )
                ) //0xff é como se fosse o # no css (vai de 00 -> totalmente transparente, até ff -> totalmente opaco)
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    R.drawable.treadmill_machine     //pasta res, pasta drawable.imagem escolhida
                ),
                contentDescription = stringResource(
                    R.string.logo
                ),
                modifier = Modifier
                    .padding(top = 36.dp)
            )
            Text(
                text = stringResource(
                    R.string.welcome
                ),
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp), //sp somente texto, de resto, dp
                shape = RoundedCornerShape(
                    topStart = 42.dp,
                    topEnd = 42.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        contentColor = Color.White
                    ),

            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 32.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.End
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 10.dp),
                    ) {
                        Text(
                            text = stringResource(
                                R.string.your_name
                            ),
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        TextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 5.dp)
                        )
                    }
                    Button(
                        onClick = {},
                        shape= RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = stringResource(
                                R.string.next
                            ),

                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
            }
        }
    }
}

//funcao de preview (montar tela "falsa")
@Preview(showSystemUi = true) //mostrar barra de rolagem e superior do celular
@Composable
private fun HomeScreenPreview() {
    //está chamando a funcao de composicao (+ split)
    HomeScreen()
}

