package com.dicoding.androidprogramming.submission1jetpackpro.ui.series

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.androidprogramming.submission1jetpackpro.databinding.FragmentSeriesBinding
import com.dicoding.androidprogramming.submission1jetpackpro.viewmodel.ViewModelFactory
import com.dicoding.androidprogramming.submission1jetpackpro.vo.Status

class SeriesFragment : Fragment() {
    private lateinit var fragmentSeriesBinding: FragmentSeriesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSeriesBinding = FragmentSeriesBinding.inflate(layoutInflater, container, false)
        return fragmentSeriesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this,factory)[SeriesViewModel::class.java]

            val seriesAdapter = SeriesAdapter()
            viewModel.getSeries().observe(viewLifecycleOwner, { shows ->
                if (shows != null){
                    when(shows.status){
                        Status.LOADING -> fragmentSeriesBinding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            fragmentSeriesBinding.progressBar.visibility = View.GONE
                            seriesAdapter.submitList(shows.data)
                            seriesAdapter.notifyDataSetChanged()
                        }
                        Status.ERROR -> {
                            fragmentSeriesBinding.progressBar.visibility = View.GONE
                            Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            with(fragmentSeriesBinding.rvShows){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = seriesAdapter
            }
        }
    }

}