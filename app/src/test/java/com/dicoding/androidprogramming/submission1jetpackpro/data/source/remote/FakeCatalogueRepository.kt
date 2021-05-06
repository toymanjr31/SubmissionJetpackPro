package com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueDataSource
import com.dicoding.androidprogramming.submission1jetpackpro.data.NetworkBoundResource
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.LocalDataSource
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.MovieResponse
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ShowResponse
import com.dicoding.androidprogramming.submission1jetpackpro.utils.AppExecutors
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Resource

class FakeCatalogueRepository constructor(
        private val remoteDataSource: RemoteDataSource,
        private val localDataSource: LocalDataSource,
        private val appExecutors: AppExecutors): CatalogueDataSource {

    override fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>> {
        return object : NetworkBoundResource<PagedList<MovieEntity>, List<MovieResponse>>(appExecutors){
            public override fun loadFromDB(): LiveData<PagedList<MovieEntity>> {
                val config = PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(4)
                        .setPageSize(4)
                        .build()
                return LivePagedListBuilder(localDataSource.getAllMovies(), config).build()
            }

            override fun shouldFetch(data: PagedList<MovieEntity>?): Boolean =
                    data == null || data.isEmpty()

            public override fun createCall(): LiveData<ApiResponse<List<MovieResponse>>> =
                    remoteDataSource.getMoviesList()

            public override fun saveCallResult(data: List<MovieResponse>) {
                val list = ArrayList<MovieEntity>()
                for (response in data){
                    val movie = MovieEntity(
                            movieId = response.id,
                            movieTitle = response.originalTitle,
                            movieDescription = response.overview,
                            moviePoster = response.posterPath,
                            movieFavorited = false
                    )
                    list.add(movie)
                }
                localDataSource.insertMovies(list)
            }
        }.asLiveData()
    }

    override fun getMovieById(id: Int): LiveData<MovieEntity> {
        return localDataSource.getMovieWithId(id)
    }

    override fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>> {
        val config = PagedList.Config.Builder()
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(4)
                .setPageSize(4)
                .build()
        return LivePagedListBuilder(localDataSource.getFavoriteMovies(), config).build()
    }

    override fun setFavoriteMovie(movie: MovieEntity, state: Boolean) {
        appExecutors.diskIO().execute {
            localDataSource.setMovieFavorite(movie, state)
        }
    }

    override fun getSeries(): LiveData<Resource<PagedList<ShowEntity>>> {
        return object : NetworkBoundResource<PagedList<ShowEntity>, List<ShowResponse>>(appExecutors){
            public override fun loadFromDB(): LiveData<PagedList<ShowEntity>> {
                val config = PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(4)
                        .setPageSize(4)
                        .build()
                return LivePagedListBuilder(localDataSource.getAllSeries(), config).build()
            }

            override fun shouldFetch(data: PagedList<ShowEntity>?): Boolean =
                    data == null || data.isEmpty()

            public override fun createCall(): LiveData<ApiResponse<List<ShowResponse>>> =
                    remoteDataSource.getSeriesList()

            public override fun saveCallResult(data: List<ShowResponse>) {
                val list = ArrayList<ShowEntity>()
                for (response in data){
                    val show = ShowEntity(
                            showId = response.id,
                            showTitle = response.originalName,
                            showDescription = response.overview,
                            showPoster = response.posterPath,
                            showFavorited = false
                    )
                    list.add(show)
                }
                localDataSource.insertShows(list)
            }

        }.asLiveData()
    }

    override fun getShowById(id: Int): LiveData<ShowEntity> {
        return localDataSource.getSeriesWithId(id)
    }

    override fun getFavoriteSeries(): LiveData<PagedList<ShowEntity>> {
        val config = PagedList.Config.Builder()
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(4)
                .setPageSize(4)
                .build()
        return LivePagedListBuilder(localDataSource.getFavoriteSeries(), config).build()
    }

    override fun setFavoriteShow(show: ShowEntity, state: Boolean) {
        appExecutors.diskIO().execute {
            localDataSource.setSeriesFavorite(show, state)
        }
    }
}