package com.example.myapplication.data.repository

import com.example.myapplication.ui.model.GitHubUserUiState

interface GitHubUserRepository {
    suspend fun getUser(username:String): Result<GitHubUserUiState.Success>
}