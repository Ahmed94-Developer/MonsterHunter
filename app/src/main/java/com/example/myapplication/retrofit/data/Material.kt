package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Material {
    @SerializedName("quantity")
    @Expose
    var quantity: Int? = null

    @SerializedName("item")
    @Expose
    var item: Item? = null
}