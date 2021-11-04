package com.example.list_of_months.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.list_of_months.R
import com.example.list_of_months.model.model

class itemAdapter(private val context:Context , private val dataset:List<model>
): RecyclerView.Adapter<itemAdapter.itemviewHolder>() {

    class itemviewHolder(private val view:View):RecyclerView.ViewHolder(view){
        val textview:TextView = view.findViewById(R.id.item_month)
        val imageView:ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemviewHolder {
        val adapterlayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item , parent,false)
        return itemviewHolder(adapterlayout)
    }

    override fun onBindViewHolder(holder: itemviewHolder, position: Int) {
        val item =dataset[position]
        holder.textview.text = context.resources.getString(item.Resurce)
        holder.imageView.setImageResource(item.imageRecurce)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}