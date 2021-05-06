package com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity

@Dao
interface CatalogueDao {
    @Query("SELECT * FROM movieentities")
    fun getAllMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM movieentities WHERE movieId = :id")
    fun getMovieWithId(id: Int): LiveData<MovieEntity>

    @Query("SELECT * FROM movieentities WHERE movieFavorited = 1")
    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM showentities")
    fun getAllSeries(): DataSource.Factory<Int, ShowEntity>

    @Query("SELECT * FROM showentities WHERE showId =:id")
    fun getSeriesWithId(id: Int): LiveData<ShowEntity>

    @Query("SELECT * FROM showentities WHERE showFavorited = 1")
    fun getFavoriteSeries(): DataSource.Factory<Int, ShowEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MovieEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertShows(shows: List<ShowEntity>)

    @Update
    fun updateMovie(movie: MovieEntity)

    @Update
    fun updateSeries(series: ShowEntity)
}