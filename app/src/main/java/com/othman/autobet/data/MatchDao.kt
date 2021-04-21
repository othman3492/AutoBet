package com.othman.autobet.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.othman.autobet.model.Match


@Dao
interface MatchDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatch(item: Match)

    @Delete
    suspend fun deleteMatch(item: Match)

    @Query("SELECT * FROM matches")
    fun getMatches(): LiveData<List<Match>>
}
