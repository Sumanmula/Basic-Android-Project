package com.example.learnandroid.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.learnandroid.viewmodel.RegisterScreenViewModel

@Composable
fun RegisterScreen(
    viewModel: RegisterScreenViewModel,
    navController: NavController
) {
    val isEnabled = viewModel.registerButton

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = viewModel.name,
            onValueChange = {viewModel.name = it},
            label = { Text("Enter Your FullName") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        TextField(
            value = viewModel.email,
            onValueChange = {viewModel.email = it},
            label = {Text("Enter Your Email")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        TextField(
            value = viewModel.workplace,
            onValueChange = {viewModel.workplace = it},
            label = {Text("Enter Your Workplace")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        TextField(
            value = viewModel.designation,
            onValueChange = {viewModel.designation = it},
            label = {Text("Enter Your Designation")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        TextField(
            value = viewModel.password,
            onValueChange = {viewModel.password = it},
            label = {Text("Enter Your Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        Button(
            onClick = {navController.navigate("second")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            enabled = viewModel.registerButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isEnabled) Color(0xFF4CAF50) else Color(0xFFB8E0BA),
                disabledContainerColor = Color(0xFFB8E0BA),
                disabledContentColor = Color(0xFFF9F9FC)
            )
        ) {
            Text("Register")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Already have an account?")
            TextButton(
                onClick = {navController.navigate("first")}
            ) {
                Text("Login")
            }
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(
        viewModel = RegisterScreenViewModel(),
        navController = NavController(LocalContext.current)
    )
}