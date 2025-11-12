package com.example.myapplication.data.service

import com.example.myapplication.data.model.GitHubUserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubApiService{
    @GET("users/{username}")
    suspend fun getUser(
        @Path("username") username:String
    ): GitHubUserResponse
}