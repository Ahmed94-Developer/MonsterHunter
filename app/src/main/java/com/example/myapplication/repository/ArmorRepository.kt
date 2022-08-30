package com.example.myapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.retrofit.api.DataApi
import com.example.myapplication.retrofit.data.HunterData
import javax.inject.Inject

class ArmorRepository @Inject constructor(private val dataApi: DataApi) {
    private val armors = MutableLiveData<List<HunterData>>()
    val armorsLiveData : LiveData<List<HunterData>> get()= armors

    suspend fun getArmors(){
        val result = dataApi.getArmors()
        if (result.isSuccessful && result.body() != null){
            armors.postValue(result.body())
        }

    }
}