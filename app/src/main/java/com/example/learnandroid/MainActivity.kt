package com.example.learnandroid

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.learnandroid.ui.theme.LearnAndroidTheme
import com.example.learnandroid.view.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnAndroidTheme {
                val navController = rememberNavController()
                AppNavigation(navController)
            }
        }
    }
}