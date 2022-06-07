package com.example.notecamvvm.domain.usecase

import com.example.notecamvvm.domain.model.Note
import com.example.notecamvvm.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteUseCaseImpl(val repository: NoteRepository) : NoteUseCase {
    override fun getAllNotes(): Flow<List<Note>> {
        return repository.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return repository.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return repository.insertNote(note = note)
    }

    override suspend fun deleteNote(note: Note) {
        return repository.deleteNote(note)
    }


}