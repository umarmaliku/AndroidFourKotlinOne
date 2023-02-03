package com.example.androidfourkotlinone.data.repository

import androidx.lifecycle.liveData
import com.example.androidfourkotlinone.data.models.Attributes
import com.example.androidfourkotlinone.data.models.DataItem
import com.example.androidfourkotlinone.data.models.Response
import com.example.androidfourkotlinone.data.remote.apiservice.ApiService
import javax.inject.Inject

class Repository @Inject constructor(private val service: ApiService) {

    fun fetch() = liveData<Response<DataItem>> {
        emit(service.fetch())
    }
}