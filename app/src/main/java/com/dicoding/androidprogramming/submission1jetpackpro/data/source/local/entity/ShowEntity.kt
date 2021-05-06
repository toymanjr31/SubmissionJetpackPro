package com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "showentities")
data class ShowEntity(
        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "showId")
        var showId: Int = 0,

        @ColumnInfo(name = "showTitle")
        var showTitle: String? = null,

        @ColumnInfo(name = "showDescription")
        var showDescription: String? = null,

        @ColumnInfo(name = "showPoster")
        var showPoster: String? = null,

        @ColumnInfo(name = "showFavorited")
        var showFavorited: Boolean = false
)