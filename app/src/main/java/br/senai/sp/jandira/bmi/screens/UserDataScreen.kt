package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) { //funcao de composicao (sempre com letra maiuscula) que diz que vamos fazer composicao de tela
    Box(
        modifier = Modifier
            .fillMaxSize() //do tamanho maximo dentro do pai, ou seja, do celular
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xff4B0082),
                            Color(0xff8A2BE2)
                        )
                    )
                ),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = stringResource(
                    R.string.hi
                ),
                modifier = Modifier
                    .padding(start = 20.dp, top = 40.dp),
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(730.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp)


            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 50.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Column (

                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card (
                                modifier = Modifier
                                    .size(120.dp),
                                shape = CircleShape,
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xff0000ff)
                                )
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.boy
                                    ),
                                    contentDescription = "",


                                    )
                            }
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(20.dp),
                                colors = ButtonDefaults.buttonColors(
                                    Color(0xff0000ff)
                                ),
                                modifier = Modifier
                                    .width(100.dp)
                                    .padding(top = 10.dp)
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.male
                                    )
                                )
                            }

                        }
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){

                            Card (
                                modifier = Modifier
                                    .size(120.dp),
                                shape = CircleShape,
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFF5D0894)
                                )
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.female
                                    ),
                                    contentDescription = ""
                                )
                            }

                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(20.dp),
                                colors = ButtonDefaults.buttonColors(
                                    Color(0xFF510683)
                                ),
                                modifier = Modifier
                                    .width(100.dp)
                                    .padding(top = 10.dp)
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.female
                                    )
                                )
                            }
                        }
                    }
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Age") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Numbers,
                                contentDescription = "",
                                tint = Color(0xFF510683)
                            )
                        },
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .padding(top = 65.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Next
                        )
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Weight") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Balance,
                                contentDescription = "",
                                tint = Color(0xFF510683)
                            )
                        },
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .padding(top = 15.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Decimal,
                            imeAction = ImeAction.Next
                        )
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Height") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Height,
                                contentDescription = "",
                                tint = Color(0xFF510683)
                            )
                        },
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .padding(top = 15.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Decimal,
                            imeAction = ImeAction.Next
                        )
                    )
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(15.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color(0xFF510683)
                        ),
                        modifier = modifier
                            .padding(top = 80.dp)
                    ) {
                        Text(
                            text = stringResource(
                                R.string.calculate
                            ),
                            fontSize = 25.sp
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
private fun UserDataScreenPreview() {
    //está chamando a funcao de composicao (+ split)
    UserDataScreen()
}



