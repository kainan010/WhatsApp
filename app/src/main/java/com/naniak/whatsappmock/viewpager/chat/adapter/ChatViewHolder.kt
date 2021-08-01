package com.naniak.whatsappmock.viewpager.chat.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R

class ChatViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
    private var imgChat = itemView.findViewById<ImageView>(R.id.ivMessage)
    private var nameChat = itemView.findViewById<TextView>(R.id.tvMessageName)
    private var dateChat = itemView.findViewById<TextView>(R.id.tvMessage)


    fun bind(chat: Chat){
        imgChat.setImageResource(chat.image)
        nameChat.text = chat.name
        dateChat.text = chat.date
    }
}