package com.dicoding.androidprogramming.submission1jetpackpro.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.dicoding.androidprogramming.submission1jetpackpro.R
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.ActivityHomeBinding
import com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.FavoriteActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewPager.adapter = sectionPagerAdapter
        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)

        supportActionBar?.elevation = 0f
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.to_favorite -> {
                val i = Intent(this@HomeActivity, FavoriteActivity::class.java)
                startActivity(i)
                return true
            }
            else -> return true
        }
    }
}