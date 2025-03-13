package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi.screens.HomeScreen
import br.senai.sp.jandira.bmi.screens.UserDataScreen
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMITheme {
                //vai lembrar das telas onde passamos e a sequencia delas
                var navegacao= rememberNavController()
                    NavHost(
                        navController=navegacao,
                        startDestination = "home" //nome de associacao a tela
                ){
                        //quando a rota home for chamada,vamos para a tela criada
                        composable(route = "home"){ HomeScreen(navegacao) }
                        composable(route = "dados"){ UserDataScreen() }
                    }
            }
        }
    }
}
