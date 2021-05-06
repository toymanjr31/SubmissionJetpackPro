package com.dicoding.androidprogramming.submission1jetpackpro.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.LocalDataSource
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.FakeCatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.RemoteDataSource
import com.dicoding.androidprogramming.submission1jetpackpro.utils.*
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Resource
import com.nhaarman.mockitokotlin2.doNothing
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.times

class CatalogueRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val local = Mockito.mock(LocalDataSource::class.java)
    private val appExecutor = Mockito.mock(AppExecutors::class.java)

    private val catalogueRepository = FakeCatalogueRepository(remote,local,appExecutor)

    private val testExecutors: AppExecutors = AppExecutors(TestExecutor(), TestExecutor(), TestExecutor())

    private val listMovieResponse = DataDummy.generateDummyMovieResponse()
    private val listSeriesResponse = DataDummy.generateDummyShowsResponse()

    @Test
    fun getMovies() {
        val dataSourceFactory = Mockito.mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getAllMovies()).thenReturn(dataSourceFactory)
        catalogueRepository.getMovies()

        val movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovies()))
        verify(local).getAllMovies()
        assertNotNull(movieEntities.data)
        assertEquals(listMovieResponse.size.toLong(), movieEntities.data?.size?.toLong())
    }

    @Test
    fun getMovieById() {
        val dummyEntity = MutableLiveData<MovieEntity>()
        val movie = DataDummy.generateDummyMovies()[0]
        dummyEntity.value = movie
        `when`(local.getMovieWithId(movie.movieId)).thenReturn(dummyEntity)

        val movieData = LiveDataTestUtil.getValue(catalogueRepository.getMovieById(movie.movieId))
        verify(local).getMovieWithId(movie.movieId)
        assertNotNull(movieData)
        assertEquals(movie.movieId, movieData.movieId)
    }

    @Test
    fun getFavoriteMovies() {
        val dataSourceFactory = Mockito.mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getFavoriteMovies()).thenReturn(dataSourceFactory)
        catalogueRepository.getFavoriteMovies()

        val movieEntity = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovies()))
        verify(local).getFavoriteMovies()
        assertNotNull(movieEntity.data)
        assertEquals(listMovieResponse.size.toLong(), movieEntity.data?.size?.toLong())
    }

    @Test
    fun getSeries() {
        val dataSourceFactory = Mockito.mock(DataSource.Factory::class.java) as DataSource.Factory<Int, ShowEntity>
        `when`(local.getAllSeries()).thenReturn(dataSourceFactory)
        catalogueRepository.getSeries()

        val showEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyShows()))
        verify(local).getAllSeries()
        assertNotNull(showEntities.data)
        assertEquals(listSeriesResponse.size.toLong(), showEntities.data?.size?.toLong())
    }

    @Test
    fun getShowById() {
        val dummyEntity = MutableLiveData<ShowEntity>()
        val show = DataDummy.generateDummyShows()[0]
        dummyEntity.value = show
        `when`(local.getSeriesWithId(show.showId)).thenReturn(dummyEntity)

        val showData = LiveDataTestUtil.getValue(catalogueRepository.getShowById(show.showId))
        verify(local).getSeriesWithId(show.showId)
        assertNotNull(showData)
        assertEquals(show.showId, showData.showId)
    }

    @Test
    fun getFavoriteSeries() {
        val dataSourceFactory = Mockito.mock(DataSource.Factory::class.java) as DataSource.Factory<Int, ShowEntity>
        `when`(local.getFavoriteSeries()).thenReturn(dataSourceFactory)
        catalogueRepository.getFavoriteSeries()

        val tvShowEntity = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyShows()))
        verify(local).getFavoriteSeries()
        assertNotNull(tvShowEntity.data)
        assertEquals(listSeriesResponse.size.toLong(), tvShowEntity.data?.size?.toLong())
    }

    @Test
    fun setFavoriteMovie(){
        val dummyMovie = DataDummy.generateDummyMovies()[0]
        val newState: Boolean = !dummyMovie.movieFavorited

        `when`(appExecutor.diskIO()).thenReturn(testExecutors.diskIO())
        doNothing().`when`(local).setMovieFavorite(dummyMovie, newState)

        catalogueRepository.setFavoriteMovie(dummyMovie, newState)
        verify(local, times(1)).setMovieFavorite(dummyMovie, newState)
        verifyNoMoreInteractions(local)
    }

    @Test
    fun setFavoriteShow(){
        val dummyShow = DataDummy.generateDummyShows()[0]
        val newState: Boolean = !dummyShow.showFavorited

        `when`(appExecutor.diskIO()).thenReturn(testExecutors.diskIO())
        doNothing().`when`(local).setSeriesFavorite(dummyShow, newState)

        catalogueRepository.setFavoriteShow(dummyShow, newState)
        verify(local, times(1)).setSeriesFavorite(dummyShow, newState)
        verifyNoMoreInteractions(local)
    }
}