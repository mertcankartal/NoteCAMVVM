package com.example.notecamvvm.domain.usecase

import com.example.notecamvvm.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteUseCase {

    fun getAllNotes(): Flow<List<Note>>

    suspend fun getNoteById(id:Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}