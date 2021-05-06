package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dicoding.androidprogramming.submission1jetpackpro.R
import com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.movie.MovieFavFragment
import com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.series.SeriesFavFragment

class SectionFavPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.moviefav, R.string.seriesfav)
    }

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment =
        when(position){
            0 -> MovieFavFragment()
            1 -> SeriesFavFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(TAB_TITLES[position])

}