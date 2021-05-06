package com.dicoding.androidprogramming.submission1jetpackpro.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dicoding.androidprogramming.submission1jetpackpro.data.CatalogueRepository
import com.dicoding.androidprogramming.submission1jetpackpro.di.Injection
import com.dicoding.androidprogramming.submission1jetpackpro.ui.detail.DetailViewModel
import com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.movie.MovieFavViewModel
import com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.series.SeriesFavViewModel
import com.dicoding.androidprogramming.submission1jetpackpro.ui.movie.MovieViewModel
import com.dicoding.androidprogramming.submission1jetpackpro.ui.series.SeriesViewModel

class ViewModelFactory private constructor(private val mCatalogueRepository: CatalogueRepository) : ViewModelProvider.NewInstanceFactory(){
    companion object{
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance?: synchronized(this){
                instance?: ViewModelFactory(Injection.provideRepository(context))
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when{
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mCatalogueRepository) as T
            }
            modelClass.isAssignableFrom(SeriesViewModel::class.java) -> {
                return SeriesViewModel(mCatalogueRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                return DetailViewModel(mCatalogueRepository) as T
            }
            modelClass.isAssignableFrom(MovieFavViewModel::class.java) -> {
                return MovieFavViewModel(mCatalogueRepository) as T
            }
            modelClass.isAssignableFrom(SeriesFavViewModel::class.java) -> {
                return SeriesFavViewModel(mCatalogueRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel Class: "+ modelClass.name)
        }
    }
}