package com.example.myapplication.ui.model

sealed class GitHubUserUiState {
    data object Loading : GitHubUserUiState()
    data class Success(
        val loginId: String,
        val profileImage: String,
        val name: String
    ) : GitHubUserUiState()

    data class Error(
        val message: String
    ) : GitHubUserUiState()
}