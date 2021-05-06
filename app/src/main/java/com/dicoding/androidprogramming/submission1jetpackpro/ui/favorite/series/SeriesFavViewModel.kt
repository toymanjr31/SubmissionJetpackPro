package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.series

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity

class SeriesFavViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getFavSeries(): LiveData<PagedList<ShowEntity>>{
        return catalogueRepository.getFavoriteSeries()
    }
}