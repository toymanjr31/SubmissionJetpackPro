package com.dicoding.androidprogramming.submission1jetpackpro.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.dicoding.androidprogramming.submission1jetpackpro.R
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.ActivityDetailCatalogueBinding
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.ContentDetailCatalogueBinding
import com.dicoding.androidprogramming.submission1jetpackpro.viewmodel.ViewModelFactory

class DetailCatalogueActivity : AppCompatActivity() {

    private lateinit var detailCatalogueBinding: ContentDetailCatalogueBinding

    companion object{
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailCatalogueBinding = ActivityDetailCatalogueBinding.inflate(layoutInflater)
        detailCatalogueBinding = activityDetailCatalogueBinding.detailContent

        setContentView(activityDetailCatalogueBinding.root)
        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        setSupportActionBar(activityDetailCatalogueBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val id = intent.getIntExtra(EXTRA_DATA, 0)
        val type = intent.getStringExtra(EXTRA_TYPE)

        detailCatalogueBinding.progressBar.visibility = View.VISIBLE
        detailCatalogueBinding.imgPosterDetail.visibility = View.INVISIBLE
        detailCatalogueBinding.btnShare.visibility = View.INVISIBLE
        detailCatalogueBinding.tvTitleDetail.visibility = View.INVISIBLE
        detailCatalogueBinding.textDesc.visibility = View.INVISIBLE
        detailCatalogueBinding.tvDescriptionDetail.visibility = View.INVISIBLE

        if (type == "movie"){
            viewModel.getMovieById(id).observe(this, Observer {
                it?.let {
                    val imageUrl = it.moviePoster
                    Glide.with(this)
                        .load("https://image.tmdb.org/t/p/w185$imageUrl")
                        .into(detailCatalogueBinding.imgPosterDetail)
                    detailCatalogueBinding.tvTitleDetail.text = it.movieTitle
                    detailCatalogueBinding.tvDescriptionDetail.text = it.movieDescription

                    val isFavorite = it.movieFavorited
                    if (isFavorite){
                        detailCatalogueBinding.btnFavorite.setImageResource(R.drawable.ic_baseline_favorite_50)
                    }
                    else{
                        detailCatalogueBinding.btnFavorite.setImageResource(R.drawable.ic_baseline_favorite_border_50)
                    }

                    detailCatalogueBinding.progressBar.visibility = View.GONE
                    detailCatalogueBinding.imgPosterDetail.visibility = View.VISIBLE
                    detailCatalogueBinding.btnShare.visibility = View.VISIBLE
                    detailCatalogueBinding.tvTitleDetail.visibility = View.VISIBLE
                    detailCatalogueBinding.textDesc.visibility = View.VISIBLE
                    detailCatalogueBinding.tvDescriptionDetail.visibility = View.VISIBLE

                    detailCatalogueBinding.btnFavorite.setOnClickListener {
                        viewModel.setMovieFavorite()
                    }
                }
            })
        }
        else if (type == "show"){
            viewModel.getSeriesById(id).observe(this, Observer {
                it?.let {
                    val imageUrl = it.showPoster
                    Glide.with(this)
                        .load("https://image.tmdb.org/t/p/w185$imageUrl")
                        .into(detailCatalogueBinding.imgPosterDetail)
                    detailCatalogueBinding.tvTitleDetail.text = it.showTitle
                    detailCatalogueBinding.tvDescriptionDetail.text = it.showDescription

                    val isFavorite = it.showFavorited
                    if (isFavorite){
                        detailCatalogueBinding.btnFavorite.setImageResource(R.drawable.ic_baseline_favorite_50)
                    }
                    else{
                        detailCatalogueBinding.btnFavorite.setImageResource(R.drawable.ic_baseline_favorite_border_50)
                    }

                    detailCatalogueBinding.progressBar.visibility = View.GONE
                    detailCatalogueBinding.imgPosterDetail.visibility = View.VISIBLE
                    detailCatalogueBinding.btnShare.visibility = View.VISIBLE
                    detailCatalogueBinding.tvTitleDetail.visibility = View.VISIBLE
                    detailCatalogueBinding.textDesc.visibility = View.VISIBLE
                    detailCatalogueBinding.tvDescriptionDetail.visibility = View.VISIBLE

                    detailCatalogueBinding.btnFavorite.setOnClickListener {
                        viewModel.setSeriesFavorite()
                    }
                }
            })
        }

        detailCatalogueBinding.btnShare.setOnClickListener {
            val message = detailCatalogueBinding.tvTitleDetail.text
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, getString(R.string.share_to)))
        }

    }
}