package com.example.learnandroid.model

import com.google.gson.annotations.SerializedName

data class UserList(
    @SerializedName("id")
    val id: String,

    @SerializedName("Name")
    val name: String,

    @SerializedName("Email")
    val email: String,

    @SerializedName("Workplace")
    val workplace: String,

    @SerializedName("Designation")
    val designation: String
)
