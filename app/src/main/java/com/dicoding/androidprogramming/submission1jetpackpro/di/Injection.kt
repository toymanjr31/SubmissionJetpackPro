package com.dicoding.androidprogramming.submission1jetpackpro.di

import android.content.Context
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.LocalDataSource
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.room.CatalogueDatabase
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.RemoteDataSource
import com.dicoding.androidprogramming.submission1jetpackpro.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): CatalogueRepository {
        val database = CatalogueDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance()
        val localDataSource = LocalDataSource.getInstance(database.catalogueDao())
        val appExecutors = AppExecutors()

        return CatalogueRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}