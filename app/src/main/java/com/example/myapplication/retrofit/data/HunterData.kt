package com.example.myapplication.retrofit.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.myapplication.retrofit.data.Defense
import com.example.myapplication.retrofit.data.Resistances
import com.example.myapplication.retrofit.data.Skill
import com.example.myapplication.retrofit.data.ArmorSet
import com.example.myapplication.retrofit.data.Assets
import com.example.myapplication.retrofit.data.Crafting
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class HunterData {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("rank")
    @Expose
    var rank: String? = null

    @SerializedName("rarity")
    @Expose
    var rarity: Int? = null

    @SerializedName("defense")
    @Expose
    var defense: Defense? = null

    @SerializedName("resistances")
    @Expose
    var resistances: Resistances? = null

    @SerializedName("attributes")
    @Expose
    var attributes: Attributes? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("slots")
    @Expose
    var slots: List<Any>? = null

    @SerializedName("skills")
    @Expose
    var skills: List<Skill>? = null

    @SerializedName("armorSet")
    @Expose
    var armorSet: ArmorSet? = null

    @SerializedName("assets")
    @Expose
    var assets: Assets? = null

    @SerializedName("crafting")
    @Expose
    var crafting: Crafting? = null
}