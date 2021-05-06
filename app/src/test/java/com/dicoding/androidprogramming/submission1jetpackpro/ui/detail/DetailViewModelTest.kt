package com.dicoding.androidprogramming.submission1jetpackpro.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.utils.DataDummy
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val dummyShows = DataDummy.generateDummyShows()[0]
    private val dummyMovieId = dummyMovie.movieId
    private val dummyShowId = dummyShows.showId

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observerMovie: Observer<MovieEntity>

    @Mock
    private lateinit var observerSeries: Observer<ShowEntity>

    @Before
    fun setUp(){
        viewModel = DetailViewModel(catalogueRepository)
    }

    @Test
    fun getMovieById() {
        val movie = MutableLiveData<MovieEntity>()
        movie.value = dummyMovie

        `when`(catalogueRepository.getMovieById(dummyMovieId!!)).thenReturn(movie)
        val obtainedMovieData = viewModel.getMovieById(dummyMovieId).value as MovieEntity

        verify(catalogueRepository).getMovieById(dummyMovieId)
        assertNotNull(obtainedMovieData)
        assertEquals(dummyMovie.movieId, obtainedMovieData.movieId)
        assertEquals(dummyMovie.movieTitle, obtainedMovieData.movieTitle)
        assertEquals(dummyMovie.movieDescription, obtainedMovieData.movieDescription)
        assertEquals(dummyMovie.moviePoster, obtainedMovieData.moviePoster)

        viewModel.getMovieById(dummyMovieId).observeForever(observerMovie)
        verify(observerMovie).onChanged(dummyMovie)
    }

    @Test
    fun getSeriesById() {
        val series = MutableLiveData<ShowEntity>()
        series.value = dummyShows

        `when`(catalogueRepository.getShowById(dummyShowId!!)).thenReturn(series)
        val obtainedShowData = viewModel.getSeriesById(dummyShowId).value as ShowEntity

        verify(catalogueRepository).getShowById(dummyShowId)
        assertNotNull(obtainedShowData)
        assertEquals(dummyShows.showId, obtainedShowData.showId)
        assertEquals(dummyShows.showTitle, obtainedShowData.showTitle)
        assertEquals(dummyShows.showDescription, obtainedShowData.showDescription)
        assertEquals(dummyShows.showPoster, obtainedShowData.showPoster)

        viewModel.getSeriesById(dummyShowId).observeForever(observerSeries)
        verify(observerSeries).onChanged(dummyShows)
    }

    @Test
    fun setMovieFavorite(){
        val movie = MutableLiveData<MovieEntity>()
        movie.value = dummyMovie
        val state = !dummyMovie.movieFavorited

        `when`(catalogueRepository.getMovieById(dummyMovieId)).thenReturn(movie)

        viewModel.getMovieById(dummyMovieId)
        viewModel.setMovieFavorite()

        verify(catalogueRepository, times(1)).setFavoriteMovie(movie.value!!, state)
        verifyNoMoreInteractions(observerMovie)
    }

    @Test
    fun setSeriesFavorite(){
        val show = MutableLiveData<ShowEntity>()
        show.value = dummyShows
        val state = !dummyShows.showFavorited

        `when`(catalogueRepository.getShowById(dummyShowId)).thenReturn(show)

        viewModel.getSeriesById(dummyShowId)
        viewModel.setSeriesFavorite()

        verify(catalogueRepository, times(1)).setFavoriteShow(show.value!!, state)
        verifyNoMoreInteractions(observerSeries)
    }
}