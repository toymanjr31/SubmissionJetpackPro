package com.dicoding.androidprogramming.submission1jetpackpro.ui.series

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Resource

class SeriesViewModel (private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getSeries() : LiveData<Resource<PagedList<ShowEntity>>> {
        return catalogueRepository.getSeries()
    }
}