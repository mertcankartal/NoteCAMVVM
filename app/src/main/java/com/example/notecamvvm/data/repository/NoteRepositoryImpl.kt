package com.example.notecamvvm.data.repository

import com.example.notecamvvm.data.datasource.NoteDao
import com.example.notecamvvm.domain.model.Note
import com.example.notecamvvm.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> {
       return dao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}