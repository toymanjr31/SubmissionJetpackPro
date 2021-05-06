package com.dicoding.androidprogramming.submission1jetpackpro.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dicoding.androidprogramming.submission1jetpackpro.R
import com.dicoding.androidprogramming.submission1jetpackpro.ui.movie.MovieFragment
import com.dicoding.androidprogramming.submission1jetpackpro.ui.series.SeriesFragment

class SectionPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.movie, R.string.series)
    }
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment =
        when(position){
            0 -> MovieFragment()
            1 -> SeriesFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(TAB_TITLES[position])

}