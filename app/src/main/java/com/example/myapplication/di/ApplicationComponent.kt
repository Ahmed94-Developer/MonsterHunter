package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetWorkModule::class,ArmorViewModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory{
        fun create(@BindsInstance context: Context) : ApplicationComponent
    }
}