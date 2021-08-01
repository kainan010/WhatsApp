package com.naniak.whatsappmock.viewpager.status.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R
import com.naniak.whatsappmock.viewpager.chat.adapter.Chat
import com.naniak.whatsappmock.viewpager.chat.adapter.ChatViewHolder

class StatusAdapter(private val listaStatus:List<Status>) : RecyclerView.Adapter<StatusViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.status_item_layout,parent,false)
        return StatusViewHolder(view)
    }

    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) =
        holder.bind(listaStatus[position])

    override fun getItemCount() : Int  = listaStatus.size
}