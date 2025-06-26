package com.example.learnandroid.view

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.learnandroid.viewmodel.FirstScreenViewModel
import com.example.learnandroid.viewmodel.SecondScreenViewModel

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "first") {

        composable("first") {
            val viewModel: FirstScreenViewModel = viewModel()
            FirstScreen(viewModel = viewModel, navController = navController)
        }

        composable("second") {
            val viewModel: SecondScreenViewModel = viewModel()
            SecondScreen(viewModel = viewModel)
        }
    }
}