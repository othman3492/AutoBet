package com.othman.autobet.model


import androidx.room.Entity


@Entity(tableName = "matches")
data class Match(
    val startTime: String = "",
    val homeTeam: String = "",
    val awayTeam: String = ""
)
