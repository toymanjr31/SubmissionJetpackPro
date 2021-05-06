package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.FragmentMovieFavBinding
import com.dicoding.androidprogramming.submission1jetpackpro.viewmodel.ViewModelFactory

class MovieFavFragment : Fragment() {

    private lateinit var fragmentMovieFavBinding: FragmentMovieFavBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMovieFavBinding = FragmentMovieFavBinding.inflate(layoutInflater, container, false)
        return fragmentMovieFavBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this,factory)[MovieFavViewModel::class.java]

            val movieFavAdapter = MovieFavAdapter()
            viewModel.getFavMovies().observe(viewLifecycleOwner, { movies ->
                if (movies != null){
                    movieFavAdapter.submitList(movies)
                    movieFavAdapter.notifyDataSetChanged()
                }
            })

            with(fragmentMovieFavBinding.rvMovies){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieFavAdapter
            }
        }
    }
}