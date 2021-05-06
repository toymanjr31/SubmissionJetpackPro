package com.dicoding.androidprogramming.submission1jetpackpro.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.room.CatalogueDao

class LocalDataSource private constructor(private val mCatalogueDao: CatalogueDao){
    companion object{
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(catalogueDao: CatalogueDao): LocalDataSource =
            INSTANCE?: LocalDataSource(catalogueDao)
    }

    fun getAllMovies(): DataSource.Factory<Int, MovieEntity> = mCatalogueDao.getAllMovies()

    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity> = mCatalogueDao.getFavoriteMovies()

    fun getMovieWithId(id: Int): LiveData<MovieEntity> = mCatalogueDao.getMovieWithId(id)

    fun getAllSeries(): DataSource.Factory<Int, ShowEntity> = mCatalogueDao.getAllSeries()

    fun getFavoriteSeries(): DataSource.Factory<Int, ShowEntity> = mCatalogueDao.getFavoriteSeries()

    fun getSeriesWithId(id: Int): LiveData<ShowEntity> = mCatalogueDao.getSeriesWithId(id)

    fun insertMovies(movies: List<MovieEntity>) = mCatalogueDao.insertMovies(movies)

    fun insertShows(shows: List<ShowEntity>) = mCatalogueDao.insertShows(shows)

    fun setMovieFavorite(movie: MovieEntity, newState: Boolean){
        movie.movieFavorited = newState
        mCatalogueDao.updateMovie(movie)
    }

    fun setSeriesFavorite(series: ShowEntity, newState: Boolean){
        series.showFavorited = newState
        mCatalogueDao.updateSeries(series)
    }
}