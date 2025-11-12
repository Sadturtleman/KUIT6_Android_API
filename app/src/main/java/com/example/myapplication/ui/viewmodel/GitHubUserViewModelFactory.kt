package com.example.myapplication.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.repository.GitHubUserRepository

class GitHubUserViewModelFactory (
    private val repository: GitHubUserRepository
): ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass:Class<T>):T{
        if(modelClass.isAssignableFrom(GitHubUserViewModel::class.java)){
            return GitHubUserViewModel(repository) as T
        }
        throw IllegalArgumentException("exception")
    }
}