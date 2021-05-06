package com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("original_title")
	val originalTitle: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("poster_path")
	val posterPath: String
)
