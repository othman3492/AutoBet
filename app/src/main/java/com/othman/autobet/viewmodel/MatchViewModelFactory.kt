package com.othman.autobet.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.othman.autobet.data.MatchRepository


@Suppress("UNCHECKED_CAST")
class MatchViewModelFactory(private val repository: MatchRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MatchViewModel::class.java)) {
            return MatchViewModel(
                repository
            ) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}