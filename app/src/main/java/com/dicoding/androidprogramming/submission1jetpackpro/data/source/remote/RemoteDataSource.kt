package com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.androidprogramming.submission1jetpackpro.api.ApiConfig
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ListMovieResponse
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ListSeriesResponse
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.MovieResponse
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ShowResponse
import com.dicoding.androidprogramming.submission1jetpackpro.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource {
    companion object {
        private const val TAG = "RemoteDataSource"
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource()
            }
    }

    fun getMoviesList(): LiveData<ApiResponse<List<MovieResponse>>> {
        EspressoIdlingResource.increment()
        val resultMovies = MutableLiveData<ApiResponse<List<MovieResponse>>>()
        val client = ApiConfig.getApiService().getMovieList()
        client.enqueue(object : Callback<ListMovieResponse> {
            override fun onResponse(call: Call<ListMovieResponse>, response: Response<ListMovieResponse>) {
                resultMovies.value = ApiResponse.success(response.body()?.results as List<MovieResponse>)
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<ListMovieResponse>, t: Throwable) {
                Log.e(TAG, "onFailure : ${t.message.toString()}")
                EspressoIdlingResource.decrement()
            }
        })
        return resultMovies
    }

    fun getSeriesList(): LiveData<ApiResponse<List<ShowResponse>>> {
        EspressoIdlingResource.increment()
        val resultSeries = MutableLiveData<ApiResponse<List<ShowResponse>>>()
        val client = ApiConfig.getApiService().getSeriesList()
        client.enqueue(object : Callback<ListSeriesResponse> {
            override fun onResponse(call: Call<ListSeriesResponse>, response: Response<ListSeriesResponse>) {
                resultSeries.value = ApiResponse.success(response.body()?.results as List<ShowResponse>)
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<ListSeriesResponse>, t: Throwable) {
                Log.e(TAG, "onFailure : ${t.message.toString()}")
                EspressoIdlingResource.decrement()
            }
        })
        return resultSeries
    }
}