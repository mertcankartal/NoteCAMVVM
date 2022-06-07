package com.example.notecamvvm.data.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notecamvvm.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase(){

    abstract val noteDao : NoteDao
}