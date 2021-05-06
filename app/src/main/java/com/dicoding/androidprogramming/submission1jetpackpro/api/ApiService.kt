package com.dicoding.androidprogramming.submission1jetpackpro.api

import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ListMovieResponse
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ListSeriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    fun getMovieList(
        @Query("api_key") apiKey: String = "insert api key here"
    ) : Call<ListMovieResponse>

    @GET("tv/popular")
    fun getSeriesList(
        @Query("api_key") apiKey: String = "insert api key here"
    ) : Call<ListSeriesResponse>

}