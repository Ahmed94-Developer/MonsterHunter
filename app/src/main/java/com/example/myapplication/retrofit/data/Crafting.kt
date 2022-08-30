package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.myapplication.retrofit.data.Material
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Crafting {
    @SerializedName("materials")
    @Expose
    var materials: List<Material>? = null
}