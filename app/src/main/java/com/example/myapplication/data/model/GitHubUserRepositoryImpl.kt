package com.example.myapplication.data.model

import android.util.Log
import com.example.myapplication.data.mapper.GitHubUserMapper.toUiState
import com.example.myapplication.data.repository.GitHubUserRepository
import com.example.myapplication.data.service.GitHubApiService
import com.example.myapplication.ui.model.GitHubUserUiState

class GitHubUserRepositoryImpl(
    private val apiService: GitHubApiService
) : GitHubUserRepository {
    override suspend fun getUser(username: String): Result<GitHubUserUiState.Success> {
        return runCatching{
            apiService.getUser(username).toUiState()

        }.onSuccess{
            Log.d("GitHubUserRepository","success")
        }.onFailure{
            Log.e("GitHubUserRepository","error")
        }
    }
}