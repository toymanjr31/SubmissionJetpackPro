package com.dicoding.androidprogramming.submission1jetpackpro.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Resource

class MovieViewModel (private val catalogueRepository: CatalogueRepository) : ViewModel() {
    fun getMovies() : LiveData<Resource<PagedList<MovieEntity>>> {
        return catalogueRepository.getMovies()
    }
}