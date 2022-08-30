package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.repository.ArmorRepository
import javax.inject.Inject

class ViewModelFactory @Inject constructor(private val armorRepository: ArmorRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArmorViewModel(armorRepository) as T
    }
}