package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.series

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SeriesFavViewModelTest {

    private lateinit var viewModel: SeriesFavViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<PagedList<ShowEntity>>

    @Mock
    private lateinit var pagedList: PagedList<ShowEntity>

    @Before
    fun setUp(){
        viewModel = SeriesFavViewModel(catalogueRepository)
    }
    @Test
    fun getFavSeries() {
        val dummyFavShows = pagedList
        `when`(dummyFavShows.size).thenReturn(5)
        val shows = MutableLiveData<PagedList<ShowEntity>>()
        shows.value = dummyFavShows

        `when`(catalogueRepository.getFavoriteSeries()).thenReturn(shows)
        val showEntities = viewModel.getFavSeries().value
        verify(catalogueRepository).getFavoriteSeries()
        assertNotNull(showEntities)
        assertEquals(5, showEntities?.size)

        viewModel.getFavSeries().observeForever(observer)
        verify(observer).onChanged(dummyFavShows)
    }
}