package com.dicoding.androidprogramming.submission1jetpackpro.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.ItemsCatalogueBinding
import com.dicoding.androidprogramming.submission1jetpackpro.ui.detail.DetailCatalogueActivity

class MovieAdapter : PagedListAdapter<MovieEntity, MovieAdapter.ListViewHolder>(DIFF_CALLBACK) {
    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieEntity>(){
            override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem.movieId == newItem.movieId
            }

            override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemsCatalogueBinding = ItemsCatalogueBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(itemsCatalogueBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val movie = getItem(position)
        if (movie != null){
            holder.bind(movie)
        }
    }

    class ListViewHolder (private val binding: ItemsCatalogueBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding){
                val imageUrl = movie.moviePoster
                Glide.with(itemView.context)
                        .load("https://image.tmdb.org/t/p/w185$imageUrl")
                        .into(imgPoster)
                tvTitle.text = movie.movieTitle
                itemView.setOnClickListener {
                    val intent  = Intent(itemView.context, DetailCatalogueActivity::class.java)
                    intent.putExtra(DetailCatalogueActivity.EXTRA_DATA, movie.movieId)
                    intent.putExtra(DetailCatalogueActivity.EXTRA_TYPE, "movie")
                    itemView.context.startActivity(intent)
                }
            }
        }

    }
}