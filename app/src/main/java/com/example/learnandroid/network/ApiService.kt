package com.example.learnandroid.network

import retrofit2.http.GET
import com.example.learnandroid.model.UserList

interface ApiService {
    @GET("/userList")
    suspend fun getUserList() : List<UserList>
}