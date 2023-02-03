package com.example.androidfourkotlinone.data.remote.apiservice

import com.example.androidfourkotlinone.data.models.DataItem
import com.example.androidfourkotlinone.data.models.Response
import retrofit2.http.GET

interface ApiService {

    @GET("anime")
    suspend fun fetch(): Response<DataItem>
}