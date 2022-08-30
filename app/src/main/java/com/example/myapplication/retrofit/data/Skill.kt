package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Skill {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("level")
    @Expose
    var level: Int? = null

    @SerializedName("modifiers")
    @Expose
    var modifiers: Modifiers? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("skill")
    @Expose
    var skill: Int? = null

    @SerializedName("skillName")
    @Expose
    var skillName: String? = null
}