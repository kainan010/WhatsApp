package com.naniak.whatsappmock.viewpager.calls.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R

class CallViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
    private var imgCall = itemView.findViewById<ImageView>(R.id.imgCall)
    private var nameCall = itemView.findViewById<TextView>(R.id.txtCallName)
    private var dateCall = itemView.findViewById<TextView>(R.id.txtCallDate)


    fun bind(call: Call){
        imgCall.setImageResource(call.image)
        nameCall.text = call.name
        dateCall.text = call.date
    }
}

