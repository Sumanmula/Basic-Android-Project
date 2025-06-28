package com.example.learnandroid.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class FirstScreenViewModel : ViewModel() {
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    val loginButton: Boolean
        get() = email.isNotEmpty() && password.isNotEmpty()
}