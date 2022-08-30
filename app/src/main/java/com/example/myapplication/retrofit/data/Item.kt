package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Item {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("rarity")
    @Expose
    var rarity: Int? = null

    @SerializedName("carryLimit")
    @Expose
    var carryLimit: Int? = null

    @SerializedName("value")
    @Expose
    var value: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null
}