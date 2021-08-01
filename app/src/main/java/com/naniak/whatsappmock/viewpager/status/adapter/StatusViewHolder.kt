package com.naniak.whatsappmock.viewpager.status.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R



class StatusViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
    private var imgStatus = itemView.findViewById<ImageView>(R.id.ivMessage)
    private var nameStatus = itemView.findViewById<TextView>(R.id.tvMessageName)
    private var dateStatus = itemView.findViewById<TextView>(R.id.tvMessage)


    fun bind(status: Status){
        imgStatus.setImageResource(status.image)
        nameStatus.text = status.name
        dateStatus.text = status.date
    }
}