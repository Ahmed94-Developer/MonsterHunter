package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.repository.ArmorRepository
import com.example.myapplication.retrofit.data.HunterData
import kotlinx.coroutines.launch

class ArmorViewModel(val armorRepository: ArmorRepository) : ViewModel() {
    val armorsLiveData : LiveData<List<HunterData>>
    get() = armorRepository.armorsLiveData

    init {
        viewModelScope.launch {
            armorRepository.getArmors()
        }
    }
}