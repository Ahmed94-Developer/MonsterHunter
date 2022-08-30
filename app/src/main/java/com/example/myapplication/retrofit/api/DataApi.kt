package com.example.myapplication.retrofit.api

import com.example.myapplication.retrofit.data.HunterData
import retrofit2.Response
import retrofit2.http.GET

interface DataApi {
    @GET("armor")
    suspend fun getArmors() : Response<List<HunterData>>
}