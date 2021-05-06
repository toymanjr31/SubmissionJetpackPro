package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
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
class MovieFavViewModelTest {
    private lateinit var viewModel: MovieFavViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<PagedList<MovieEntity>>

    @Mock
    private lateinit var pagedList: PagedList<MovieEntity>

    @Before
    fun setUp(){
        viewModel = MovieFavViewModel(catalogueRepository)
    }

    @Test
    fun getFavMovies() {
        val dummyFavMovies = pagedList
        `when`(dummyFavMovies.size).thenReturn(5)
        val movies = MutableLiveData<PagedList<MovieEntity>>()
        movies.value = dummyFavMovies

        `when`(catalogueRepository.getFavoriteMovies()).thenReturn(movies)
        val movieEntities = viewModel.getFavMovies().value
        verify(catalogueRepository).getFavoriteMovies()
        assertNotNull(movieEntities)
        assertEquals(5, movieEntities?.size)

        viewModel.getFavMovies().observeForever(observer)
        verify(observer).onChanged(dummyFavMovies)
    }
}