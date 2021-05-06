package com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity

@Database(entities = [MovieEntity::class, ShowEntity::class],
    version = 1,
    exportSchema = false)
abstract class CatalogueDatabase : RoomDatabase() {
    abstract fun catalogueDao(): CatalogueDao

    companion object {

        @Volatile
        private var INSTANCE: CatalogueDatabase? = null

        fun getInstance(context: Context): CatalogueDatabase =
            INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    CatalogueDatabase::class.java,
                    "Catalogue.db"
                ).build().apply {
                    INSTANCE = this
                }
            }
    }
}