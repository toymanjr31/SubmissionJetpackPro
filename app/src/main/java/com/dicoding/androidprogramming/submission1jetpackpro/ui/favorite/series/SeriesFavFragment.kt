package com.dicoding.androidprogramming.submission1jetpackpro.ui.favorite.series

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.FragmentSeriesFavBinding
import com.dicoding.androidprogramming.submission1jetpackpro.viewmodel.ViewModelFactory

class SeriesFavFragment : Fragment() {

    private lateinit var fragmentSeriesFavBinding: FragmentSeriesFavBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSeriesFavBinding = FragmentSeriesFavBinding.inflate(layoutInflater, container, false)
        return fragmentSeriesFavBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[SeriesFavViewModel::class.java]

            val seriesFavAdapter = SeriesFavAdapter()
            viewModel.getFavSeries().observe(viewLifecycleOwner, {series ->
                if (series != null){
                    seriesFavAdapter.submitList(series)
                    seriesFavAdapter.notifyDataSetChanged()
                }
            })
            with(fragmentSeriesFavBinding.rvShows){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = seriesFavAdapter
            }
        }
    }
}