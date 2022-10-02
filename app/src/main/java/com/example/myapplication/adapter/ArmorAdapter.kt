package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.retrofit.data.HunterData
import com.squareup.picasso.Picasso

class ArmorAdapter(context: Context) : RecyclerView.Adapter<ArmorAdapter.ArmorViewHolder>() {
    private var hunterDataList: List<HunterData> = ArrayList<HunterData>()
    private val context: Context = context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArmorViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(
            R.layout.armor_slot_row,
            parent,
            false
        )
        return ArmorViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ArmorViewHolder, position: Int) {
        val hunterData: HunterData = hunterDataList.get(position)

        holder.nameTxt.setText(hunterData.name)
        holder.rankTxt.setText(hunterData.rank)
        holder.defenseTxt.setText(" " + hunterData.defense!!.max.toString() + "+")

        try {
            Picasso.get().load(hunterData.assets!!.imageMale).into(
                holder.armorImg,
                object : com.squareup.picasso.Callback {
                    override fun onSuccess() {
                        //set animations here

                    }

                    override fun onError(e: java.lang.Exception?) {
                        //do smth when there is picture loading error
                    }
                })
        } catch (exception: Exception) {
            exception.printStackTrace()
        }


    }
    fun filterList(filterlist: ArrayList<HunterData>) {

        // below line is to add our filtered

        // list in our course array list.

        hunterDataList = filterlist

        // below line is to notify our adapter

        // as change in recycler view data.

        notifyDataSetChanged()

    }

    fun setArmorData(armorData: List<HunterData>?) {
        if (armorData != null) {
            this.hunterDataList = armorData
        }
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return hunterDataList.size
    }


    class ArmorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTxt = itemView.findViewById<TextView>(R.id.name_txt)
        val rankTxt = itemView.findViewById<TextView>(R.id.rank_txt)
        val defenseTxt = itemView.findViewById<TextView>(R.id.defense_txt)
        val armorImg = itemView.findViewById<ImageView>(R.id.imageView)

    }
}