package com.example.notecamvvm.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_db")
data class Note(
    @PrimaryKey(autoGenerate = true) val id:Int,
    val title:String,
    val description:String,
    val timeStamp:Long,

    )
