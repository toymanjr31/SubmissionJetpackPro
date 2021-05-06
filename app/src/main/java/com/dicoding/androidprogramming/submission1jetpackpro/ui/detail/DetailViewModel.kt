package com.dicoding.androidprogramming.submission1jetpackpro.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository

class DetailViewModel (private val catalogueRepository: CatalogueRepository) : ViewModel() {
    private lateinit var obtainedMovie: LiveData<MovieEntity>
    private lateinit var obtainedShow: LiveData<ShowEntity>

    fun getMovieById(id: Int): LiveData<MovieEntity>{
        obtainedMovie = catalogueRepository.getMovieById(id)
        return obtainedMovie
    }
    fun getSeriesById(id: Int): LiveData<ShowEntity>{
        obtainedShow = catalogueRepository.getShowById(id)
        return obtainedShow
    }

    fun setMovieFavorite(){
        val movieResource = obtainedMovie.value
        if (movieResource != null){
            val newState = !movieResource.movieFavorited
            catalogueRepository.setFavoriteMovie(movieResource, newState)
        }
    }

    fun setSeriesFavorite(){
        val showResource = obtainedShow.value
        if (showResource != null){
            val newState = !showResource.showFavorited
            catalogueRepository.setFavoriteShow(showResource, newState)
        }
    }
}