package com.example.myapplication.di

import androidx.lifecycle.ViewModel
import com.example.myapplication.viewmodel.ArmorViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ArmorViewModule {
    @Binds
    @ClassKey(ArmorViewModel::class)
    @IntoMap
    abstract fun mainViewModel(armorViewModel: ArmorViewModel) : ViewModel

}