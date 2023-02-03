package com.example.androidfourkotlinone.ui.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidfourkotlinone.R
import com.example.androidfourkotlinone.data.models.DataItem
import com.example.androidfourkotlinone.databinding.FragmentMainBinding
import com.example.androidfourkotlinone.ui.adapter.MainAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel: MainViewModel by viewModels()
    private val binding by viewBinding(FragmentMainBinding::bind)
    private val allAnime = arrayListOf<DataItem>()
    private val mainAdapter = MainAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupObserves()
    }

    private fun initialize() {
        binding.recyclerView.adapter = mainAdapter
    }

    private fun setupObserves() {
        viewModel.fetch().observe(viewLifecycleOwner) {
            allAnime.addAll(it.data)
            mainAdapter.submitList(allAnime)
            mainAdapter.notifyDataSetChanged()
        }
    }
}


