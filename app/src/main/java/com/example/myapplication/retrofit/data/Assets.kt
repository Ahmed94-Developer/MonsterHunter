package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Assets {
    @SerializedName("imageMale")
    @Expose
    var imageMale: String? = null

    @SerializedName("imageFemale")
    @Expose
    var imageFemale: String? = null
}