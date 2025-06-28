package com.example.learnandroid.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class RegisterScreenViewModel : ViewModel() {

    var name by mutableStateOf("")
    var email by mutableStateOf("")
    var workplace by mutableStateOf("")
    var designation by mutableStateOf("")
    var password by mutableStateOf("")

    val registerButton : Boolean
        get() = name.isNotEmpty() &&
                email.isNotEmpty() &&
                workplace.isNotEmpty() &&
                designation.isNotEmpty() &&
                password.isNotEmpty()
}