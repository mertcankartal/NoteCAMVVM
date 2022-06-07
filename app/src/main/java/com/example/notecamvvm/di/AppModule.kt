package com.example.notecamvvm.di

import android.app.Application
import androidx.room.Room
import com.example.notecamvvm.data.datasource.NoteDao
import com.example.notecamvvm.data.datasource.NoteDatabase
import com.example.notecamvvm.data.repository.NoteRepositoryImpl
import com.example.notecamvvm.domain.model.Note
import com.example.notecamvvm.domain.repository.NoteRepository
import com.example.notecamvvm.domain.usecase.NoteUseCase
import com.example.notecamvvm.domain.usecase.NoteUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(app, NoteDatabase::class.java, "notes_db").build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository):NoteUseCaseImpl{
        return NoteUseCaseImpl(repository)
    }
}