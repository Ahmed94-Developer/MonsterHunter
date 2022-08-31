package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ArmorAdapter
import com.example.myapplication.application.ArmorApplication
import com.example.myapplication.viewmodel.ArmorViewModel
import com.example.myapplication.viewmodel.ViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var armorViewModel: ArmorViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val armorsRv : RecyclerView = findViewById(R.id.rv)

        (application as ArmorApplication).applicationComponent.inject(this)

        armorViewModel = ViewModelProvider(this,viewModelFactory).get(ArmorViewModel::class.java)

        armorViewModel.armorsLiveData.observe(this, Observer {
            val linearLayoutManager : LinearLayoutManager = LinearLayoutManager(this@MainActivity)
            val adapter : ArmorAdapter = ArmorAdapter(this@MainActivity)
            adapter.setArmorData(it)
            armorsRv.adapter = adapter
            armorsRv.layoutManager = linearLayoutManager
        })
    }
}