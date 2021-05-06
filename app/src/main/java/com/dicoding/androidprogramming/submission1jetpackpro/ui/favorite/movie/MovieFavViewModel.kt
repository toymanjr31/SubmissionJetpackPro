package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity

class MovieFavViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getFavMovies(): LiveData<PagedList<MovieEntity>>{
        return catalogueRepository.getFavoriteMovies()
    }
}