package com.naniak.whatsappmock.viewpager.calls.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R

class CallsAdapter(private val listaCalls:List<Call>) : RecyclerView.Adapter<CallViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.calls_item_layout,parent,false)
        return CallViewHolder(view)
    }

    override fun onBindViewHolder(holder: CallViewHolder, position: Int) =
        holder.bind(listaCalls[position])

    override fun getItemCount() : Int  = listaCalls.size



}

