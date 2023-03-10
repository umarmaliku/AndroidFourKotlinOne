package com.example.androidfourkotlinone.data.models

import com.google.gson.annotations.SerializedName

data class Response<T>(
    @SerializedName("data")
    val data: List<T>
)