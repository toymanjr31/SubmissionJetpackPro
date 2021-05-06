package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.ActivityFavoriteBinding

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityFavoriteBinding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(activityFavoriteBinding.root)

        val sectionFavPagerAdapter = SectionFavPagerAdapter(this, supportFragmentManager)
        activityFavoriteBinding.favViewPager.adapter = sectionFavPagerAdapter
        activityFavoriteBinding.favTabs.setupWithViewPager(activityFavoriteBinding.favViewPager)

        supportActionBar?.elevation = 0f
    }
}