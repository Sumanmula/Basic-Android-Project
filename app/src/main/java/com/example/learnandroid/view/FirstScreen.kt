package com.example.learnandroid.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnandroid.viewmodel.FirstScreenViewModel

@Composable
fun FirstScreen(viewModel: FirstScreenViewModel) {

    val isEnabled = viewModel.loginButton

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = viewModel.email,
            onValueChange = { viewModel.email = it },
            label = { Text("Enter Your Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        TextField(
            value = viewModel.password,
            onValueChange = { viewModel.password = it },
            label = { Text("Enter Your Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            enabled = viewModel.loginButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isEnabled) Color(0xFF4CAF50) else Color(0xFFB8E0BA),
                disabledContainerColor = Color(0xFFB8E0BA),
                disabledContentColor = Color(0xFFF9F9FC)
            )
        ) {
            Text("Login")
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    val sampleViewModel = FirstScreenViewModel().apply {
        email = ""
        password = ""
    }
    FirstScreen(viewModel = sampleViewModel)
} 