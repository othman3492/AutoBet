package com.othman.autobet.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.othman.autobet.model.Match

@Database(
    entities = [Match::class],
    version = 1
)
abstract class MatchDatabase : RoomDatabase() {

    abstract fun dao(): MatchDao

    companion object {
        @Volatile
        private var instance: MatchDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance
            ?: synchronized(LOCK) {
                instance
                    ?: createDatabase(
                        context
                    ).also { instance = it }
            }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                MatchDatabase::class.java, "MatchDB.db"
            ).build()
    }
}