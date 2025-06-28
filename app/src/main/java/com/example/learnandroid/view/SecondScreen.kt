package com.example.learnandroid.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.learnandroid.viewmodel.SecondScreenViewModel

@Composable
fun SecondScreen(viewModel: SecondScreenViewModel) {
    val users by viewModel.userList.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "User List",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(users) { user ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Name: ${user.name}",
                            color = Color.Blue,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize
                        )
                        Text(
                            text = "Email: ${user.email}",
                            color = Color.Black
                        )
                        Text(
                            text = "Workplace: ${user.workplace}",
                            color = Color.Black
                        )
                        Text(
                            text = "Designation: ${user.designation}",
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}