package com.example.myapplication

import android.annotation.SuppressLint
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
import android.widget.SearchView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ArmorAdapter
import com.example.myapplication.application.ArmorApplication
import com.example.myapplication.retrofit.data.HunterData
import com.example.myapplication.viewmodel.ArmorViewModel
import com.example.myapplication.viewmodel.ViewModelFactory
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var armorViewModel: ArmorViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var armorAdapter: ArmorAdapter

    val armorsRv : RecyclerView get() = findViewById(R.id.rv)

    val searchView : SearchView get() = findViewById(R.id.searchView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        (application as ArmorApplication).applicationComponent.inject(this)

        armorViewModel = ViewModelProvider(this,viewModelFactory).get(ArmorViewModel::class.java)

        armorViewModel.armorsLiveData.observe(this, Observer {
            val linearLayoutManager : LinearLayoutManager = LinearLayoutManager(this@MainActivity)
            armorAdapter = ArmorAdapter(this@MainActivity)
            armorAdapter.setArmorData(it)
            armorsRv.adapter = armorAdapter
            armorsRv.layoutManager = linearLayoutManager

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,

                androidx.appcompat.widget.SearchView.OnQueryTextListener {

                override fun onQueryTextSubmit(p0: String?): Boolean {

                    return false

                }
                override fun onQueryTextChange(msg: String): Boolean {

                    val filteredlist: ArrayList<HunterData> = ArrayList()


                    // running a for loop to compare elements.

                    for (item in it) {

                        // checking if the entered string matched with any item of our recycler view.

                        if (item.name!!.lowercase(Locale.getDefault()).contains(msg.lowercase(Locale.getDefault()))) {

                            // if the item is matched we are

                            // adding it to our filtered list.

                            filteredlist.add(item)

                        }

                    }

                    if (filteredlist.isEmpty()) {

                        // if no item is added in filtered list we are

                        // displaying a toast message as no data found.

                        Toast.makeText(this@MainActivity, "No Data Found..", Toast.LENGTH_SHORT).show()

                    } else {

                        // at last we are passing that filtered

                        // list to our adapter class.

                        armorAdapter.filterList(filteredlist)

                    }

                    return false

                }

            })
        })
    }

}