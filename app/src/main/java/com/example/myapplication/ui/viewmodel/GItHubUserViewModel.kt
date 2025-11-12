package com.example.myapplication.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.GitHubUserRepository
import com.example.myapplication.ui.model.GitHubUserUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GitHubUserViewModel(
    private val repository: GitHubUserRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow<GitHubUserUiState>(GitHubUserUiState.Loading)
    val uiState: StateFlow<GitHubUserUiState> = _uiState.asStateFlow()

    fun loadUser(username: String) {
        viewModelScope.launch {
            _uiState.value = GitHubUserUiState.Loading
            repository.getUser(username)
                .onSuccess{ successState->
                    _uiState.value = successState
                }
                .onFailure{exception->
                    _uiState.value = GitHubUserUiState.Error(
                        message = exception.message ?: "오류 발생"
                    )
                }
        }
    }
}