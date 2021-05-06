package com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ShowResponse(

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("original_name")
	val originalName: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("poster_path")
	val posterPath: String
)
