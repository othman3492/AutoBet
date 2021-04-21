package com.othman.autobet.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.othman.autobet.data.MatchRepository
import com.othman.autobet.model.Match
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MatchViewModel(private val repository: MatchRepository) : ViewModel() {

    // INSERT
    fun insertMatch(match: Match) = viewModelScope.launch(Dispatchers.Main) {
        repository.insertMatch(match)
    }

    // DELETE
    fun deleteMatch(match: Match) = viewModelScope.launch(Dispatchers.Main) {
        repository.deleteMatch(match)
    }

    // GET
    fun getMatches() = repository.getMatches()
}