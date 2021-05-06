package com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListSeriesResponse(
	@field:SerializedName("results")
	val results: List<ShowResponse>,
)
