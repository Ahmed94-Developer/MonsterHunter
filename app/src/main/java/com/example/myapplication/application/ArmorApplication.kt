package com.example.myapplication.application

import android.app.Application
import com.example.myapplication.di.ApplicationComponent
import com.example.myapplication.di.DaggerApplicationComponent
import dagger.Component


class ArmorApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}