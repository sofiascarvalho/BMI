package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun BMIResultScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xff4B0082),
                            Color(0xff8A2BE2)
                        )
                    )
                )
        ){
            Text(
                text = stringResource(
                    R.string.your_bmi_result
                ),
                modifier = Modifier
                    .padding(start = 20.dp, top = 40.dp),
                color = Color.Black,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Card (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 25.dp)
                    .height(770.dp),
                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xffffffff)),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Card (
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .size(120.dp),
                        shape = CircleShape,
                        border = BorderStroke(10.dp, Color(0xff4B0082))
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        )
                        {
                            Text(
                                text = stringResource(
                                    R.string.bmi_number
                                ),
                                color = Color.Black,
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold
                            ) }
                    }
                    Text(
                        text = stringResource(
                            R.string.your_class
                        ),
                        modifier = Modifier
                            .padding(top = 25.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Card (
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .height(85.dp).width(350.dp)
                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ){
                            Column (
                                modifier = Modifier
                                    .fillMaxHeight(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    ),
                                    fontSize = 18.sp
                                )
                                Text(
                                    text = stringResource(
                                        R.string.your_age
                                    ),
                                    color = Color(0xff4B0082),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Divider(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .height(76.dp)
                                    .width(2.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .fillMaxHeight(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.weight
                                    ),
                                    fontSize = 18.sp
                                )
                                Text(
                                    text = stringResource(
                                        R.string.your_weight
                                    ),
                                    color = Color(0xff4B0082),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Divider(
                                modifier = Modifier
                                    .height(76.dp)
                                    .width(2.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .fillMaxHeight(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.height
                                    ),
                                    fontSize = 18.sp
                                )
                                Text(
                                    text = stringResource(
                                        R.string.your_height
                                    ),
                                    color = Color(0xff4B0082),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 15.dp)
                            .height(250.dp)
                            .background(Color(0xff8A2BE2))
                    ){

                    }
                    Divider(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .height(1.dp)
                    )
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            Color(0xff4B0082)
                        ),
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .width(320.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(9.dp)
                    ) {
                        Text(
                            text = stringResource(
                                R.string.new_calcule
                            ),
                            fontSize = 20.sp
                        )
                    }
                }
            }

        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview(){
    BMIResultScreen()
}