package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Defense {
    @SerializedName("base")
    @Expose
    var base: Int? = null

    @SerializedName("max")
    @Expose
    var max: Int? = null

    @SerializedName("augmented")
    @Expose
    var augmented: Int? = null
}