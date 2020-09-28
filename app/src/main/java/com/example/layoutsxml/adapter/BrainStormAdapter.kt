package com.example.layoutsxml.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutsxml.R
import com.example.layoutsxml.data.BrainStorm
import kotlinx.android.synthetic.main.brain_storm_layout.view.*

class BrainStormAdapter(private val context: Context, private val dataset: List<BrainStorm>):
    RecyclerView.Adapter<BrainStormAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.brain_storm_layout, parent,false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.resourceID)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}