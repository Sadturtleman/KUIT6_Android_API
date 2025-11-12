package com.example.myapplication.data.mapper

import com.example.myapplication.data.model.GitHubUserResponse
import com.example.myapplication.ui.model.GitHubUserUiState

object GitHubUserMapper {
    fun GitHubUserResponse.toUiState(): GitHubUserUiState.Success {
        return GitHubUserUiState.Success(
            loginId = this.login,
            profileImage = this.avatarUrl,
            name = this.name
        )
    }
}