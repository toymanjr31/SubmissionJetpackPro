package com.dicoding.androidprogramming.submission1jetpackpro.ui.series

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.ItemsCatalogueBinding
import com.dicoding.androidprogramming.submission1jetpackpro.ui.detail.DetailCatalogueActivity

class SeriesAdapter : PagedListAdapter<ShowEntity, SeriesAdapter.ListViewHolder>(DIFF_CALLBACK) {
    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ShowEntity>(){
            override fun areItemsTheSame(oldItem: ShowEntity, newItem: ShowEntity): Boolean {
                return oldItem.showId == newItem.showId
            }

            override fun areContentsTheSame(oldItem: ShowEntity, newItem: ShowEntity): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemsCatalogueBinding = ItemsCatalogueBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(itemsCatalogueBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val show = getItem(position)
        if(show !=null){
            holder.bind(show)
        }
    }

    class ListViewHolder (private val binding: ItemsCatalogueBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(show: ShowEntity) {
            with(binding){
                val imageUrl = show.showPoster
                Glide.with(itemView.context)
                        .load("https://image.tmdb.org/t/p/w185$imageUrl")
                        .into(imgPoster)
                tvTitle.text = show.showTitle
                itemView.setOnClickListener {
                    val intent  = Intent(itemView.context, DetailCatalogueActivity::class.java)
                    intent.putExtra(DetailCatalogueActivity.EXTRA_DATA, show.showId)
                    intent.putExtra(DetailCatalogueActivity.EXTRA_TYPE, "show")
                    itemView.context.startActivity(intent)
                }
            }
        }

    }

}