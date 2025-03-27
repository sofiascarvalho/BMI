package br.senai.sp.jandira.bmi.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AssignmentInd
import androidx.compose.material.icons.filled.Error
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen(navegacao: NavHostController) { //funcao de composicao (sempre com letra maiuscula) que diz que vamos fazer composicao de tela
    var nameState= remember {
        mutableStateOf("")
    }

    var isErrorState= remember {
        mutableStateOf(false)
    }

    //abrir ou criar arquivo SharedPreferences
    val context= LocalContext.current //contexto local atual
    val userFile=context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    //colocar o arquivo em modo de edição
    val editor=userFile.edit() //guarda instancia do arquivo aberto e pronto para ser editado

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
                    .height(370.dp), //sp somente texto, de resto, dp
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
                            value = nameState.value,
                            onValueChange = {
                                nameState.value=it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 5.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                capitalization = KeyboardCapitalization.Sentences
                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.AccountCircle,
                                    contentDescription = "",
                                    tint = Color(0xFF510683)
                                )
                            },
                            trailingIcon = {
                                if(isErrorState.value){
                                    Icon(
                                        imageVector = Icons.Default.Error,
                                        contentDescription = "",
                                        tint = Color.Red
                                    )
                                }
                            },
                            isError = isErrorState.value,
                            supportingText = {
                                if (isErrorState.value){
                                    Text(
                                        text = stringResource(
                                            R.string.isError_message
                                        )
                                    )
                                }
                            }
                        )
                    }
                    Button(
                        // ao clicar, navegar para a tela de dados
                        onClick = {
                            if(nameState.value.isEmpty()){
                                isErrorState.value=true
                            }else{
                                editor.putString("user_name", nameState.value)
                                editor.apply()
                                navegacao.navigate("dados")
                            }
                        },
                        shape= RoundedCornerShape(8.dp),
                        colors =ButtonDefaults.buttonColors(
                            Color(0xFF510683)
                        )
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
    //HomeScreen(navegacao)
}