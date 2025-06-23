package com.example.learnandroid.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitWrapper {
    private const val BASE_URL ="https://6851c89c8612b47a2c0b3e6a.mockapi.io"

    val api : ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}