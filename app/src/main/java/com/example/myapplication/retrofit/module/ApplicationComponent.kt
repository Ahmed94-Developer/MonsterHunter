package com.example.myapplication.retrofit.module

import android.content.Context
import com.example.myapplication.ArmorViewModule
import com.example.myapplication.MainActivity
import com.example.myapplication.viewmodel.ArmorViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetWorkModule::class,ArmorViewModule::class])
public interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory{
        fun create(@BindsInstance context: Context) : ApplicationComponent
    }
}