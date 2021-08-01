package com.naniak.whatsappmock.viewpager.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R
import com.naniak.whatsappmock.viewpager.chat.adapter.Chat
import com.naniak.whatsappmock.viewpager.chat.adapter.ChatAdapter


class ChatFragment : Fragment() {
    private lateinit var chatView: View
    private lateinit var recyclerView: RecyclerView

    private val listChat = arrayListOf(
        Chat(
            R.drawable.tony_stark,
            name = "Amigo",
            date = "Estou indo Ai "
        ),
        Chat(
            R.drawable.steve_rogers,
            name = "Tio",
            date = "Tomou Bomba Hoje "
        ),
        Chat(
            R.drawable.viuva,
            name = "namorada",
            date = "Compra Chocolate pra min !"
        ),
        Chat(
            R.drawable.banner,
            name = "Sogro",
            date = "Trazer ela antes das 22h "
        ),
        Chat(
            R.drawable.thor,
            name = "Cunhado",
            date = "Sextouuu !!"
        ),
        Chat(
            R.drawable.spider,
            name = "Amigo",
            date = "treinar Segunda hein "
        ),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        chatView = inflater.inflate(R.layout.fragment_calls, container, false)
        return chatView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView = chatView.findViewById(R.id.rv_calls)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = ChatAdapter(listChat)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}