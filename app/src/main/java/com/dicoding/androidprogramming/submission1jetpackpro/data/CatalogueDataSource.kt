package com.dicoding.androidprogramming.submission1jetpackpro.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Resource

interface CatalogueDataSource {
    fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getMovieById(id: Int): LiveData<MovieEntity>

    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>>

    fun setFavoriteMovie(movie: MovieEntity, state: Boolean)

    fun getSeries(): LiveData<Resource<PagedList<ShowEntity>>>

    fun getShowById(id: Int): LiveData<ShowEntity>

    fun getFavoriteSeries(): LiveData<PagedList<ShowEntity>>

    fun setFavoriteShow(show: ShowEntity, state: Boolean)
}