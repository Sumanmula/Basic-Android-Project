package com.example.learnandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learnandroid.model.UserList
import com.example.learnandroid.network.RetrofitWrapper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SecondScreenViewModel : ViewModel() {

    private val _userList = MutableStateFlow<List<UserList>>(emptyList())
    val userList: StateFlow<List<UserList>> = _userList

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            try {
                val response = RetrofitWrapper.api.getUserList()
                _userList.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}