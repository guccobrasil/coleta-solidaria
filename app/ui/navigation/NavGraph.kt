package com.coletasolidaria.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SetupNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            // Placeholder para o Integrante 1 (Autenticação)
            ScreenPlaceholder("Tela de Login e Autenticação (Integrante 1)")
        }
        composable("morador_home") {
            // Placeholder para o Integrante 2 & 4 (Morador)
            ScreenPlaceholder("Painel do Morador / Agendamentos / Gamificação")
        }
        composable("catador_home") {
            // Placeholder para o Integrante 3 (Catador)
            ScreenPlaceholder("Painel do Catador / Gestão de Coletas")
        }
        composable("educational") {
            // Placeholder para o Integrante 5 (Educação e IA)
            ScreenPlaceholder("Guia e IA / Gemini (Integrante 5)")
        }
    }
}

@Composable
fun ScreenPlaceholder(text: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = text)
    }
}