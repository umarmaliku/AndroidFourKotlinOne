package com.example.androidfourkotlinone.ui.fragment.main

import androidx.lifecycle.ViewModel
import com.example.androidfourkotlinone.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    fun fetch() = repository.fetch()
}
