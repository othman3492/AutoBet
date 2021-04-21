package com.othman.autobet.data

import androidx.lifecycle.LiveData
import com.othman.autobet.model.Match


class MatchRepository(private val db: MatchDatabase) {

    // INSERT
    suspend fun insertMatch(match: Match) = db.dao().insertMatch(match)
    // DELETE
    suspend fun deleteMatch(match: Match) = db.dao().deleteMatch(match)
    // GET
    fun getMatches(): LiveData<List<Match>> = db.dao().getMatches()

}