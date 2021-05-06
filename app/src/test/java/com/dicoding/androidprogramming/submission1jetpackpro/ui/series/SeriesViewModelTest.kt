package com.dicoding.androidprogramming.submission1jetpackpro.ui.series

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SeriesViewModelTest{
    private lateinit var viewModel: SeriesViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<ShowEntity>>>

    @Mock
    private lateinit var pagedList: PagedList<ShowEntity>

    @Before
    fun setUp(){
        viewModel = SeriesViewModel(catalogueRepository)
    }

    @Test
    fun getSeries(){
        val dummyShows = Resource.success(pagedList)
        `when`(dummyShows.data?.size).thenReturn(5)
        val shows = MutableLiveData<Resource<PagedList<ShowEntity>>>()
        shows.value = dummyShows

        `when`(catalogueRepository.getSeries()).thenReturn(shows)
        val seriesEntities = viewModel.getSeries().value?.data
        verify(catalogueRepository).getSeries()
        assertNotNull(seriesEntities)
        assertEquals(5, seriesEntities?.size)

        viewModel.getSeries().observeForever(observer)
        verify(observer).onChanged(dummyShows)
    }
}