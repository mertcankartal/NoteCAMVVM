package com.example.notecamvvm.data.datasource

import androidx.room.*
import com.example.notecamvvm.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("Select * from note_db")
    fun getAllNotes(): Flow<List<Note>>

    @Query("select * from note_db where id=:id")
    suspend fun getNoteById(id:Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}