package com.example.androidfourkotlinone.di

import com.example.androidfourkotlinone.data.remote.RetrofitClient
import com.example.androidfourkotlinone.data.remote.apiservice.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideApiService() = RetrofitClient()

    @Singleton
    @Provides
    fun provideAnimeApiService(retrofitClient: RetrofitClient) = retrofitClient.provideAnimeApiService()
}