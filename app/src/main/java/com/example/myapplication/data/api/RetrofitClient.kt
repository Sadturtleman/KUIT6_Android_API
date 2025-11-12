package com.example.myapplication.data.api

import com.example.myapplication.data.service.GitHubApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

object RetrofitClient {
    private val json = Json{
        ignoreUnknownKeys = true

    }

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .build()

    val apiService: GitHubApiService = retrofit.create(GitHubApiService::class.java)
}