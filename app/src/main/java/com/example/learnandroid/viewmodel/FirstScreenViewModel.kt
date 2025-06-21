package com.example.learnandroid.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class FirstScreenViewModel : ViewModel() {
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    val loginButton: Boolean
        get() = email.isNotEmpty() && password.isNotEmpty()
}