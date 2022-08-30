package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Resistances {
    @SerializedName("fire")
    @Expose
    var fire: Int? = null

    @SerializedName("water")
    @Expose
    var water: Int? = null

    @SerializedName("ice")
    @Expose
    var ice: Int? = null

    @SerializedName("thunder")
    @Expose
    var thunder: Int? = null

    @SerializedName("dragon")
    @Expose
    var dragon: Int? = null
}