package com.naniak.whatsappmock.viewpager.chat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R

class ChatAdapter(private val listaChats: ArrayList<Chat>) : RecyclerView.Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_item_layout,parent,false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) =
        holder.bind(listaChats[position])

    override fun getItemCount() : Int  = listaChats.size
}