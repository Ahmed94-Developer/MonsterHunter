package com.example.myapplication.retrofit.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class ArmorSet {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("rank")
    @Expose
    var rank: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("pieces")
    @Expose
    var pieces: List<Int>? = null

    @SerializedName("bonus")
    @Expose
    var bonus: Any? = null
}