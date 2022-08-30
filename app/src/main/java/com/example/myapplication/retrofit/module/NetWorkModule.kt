package com.example.myapplication.retrofit.module

import com.example.myapplication.retrofit.api.DataApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetWorkModule {
     @Singleton
     @Provides
    fun ProvidesRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl("https://mhw-db.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun ProvidesFakerApi(retrofit: Retrofit) : DataApi {
        return retrofit.create(DataApi::class.java)
    }
}