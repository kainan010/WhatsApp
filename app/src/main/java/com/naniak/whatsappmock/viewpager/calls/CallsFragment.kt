package com.naniak.whatsappmock.viewpager.calls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R
import com.naniak.whatsappmock.viewpager.calls.adapter.Call
import com.naniak.whatsappmock.viewpager.calls.adapter.CallsAdapter


class CallsFragment : Fragment() {
    private lateinit var callView: View
    private lateinit var recyclerView: RecyclerView

    private val listCalls = arrayListOf(
        Call(
            R.drawable.tony_stark,
            name = "Amigo",
            date = "Now"
        ),
        Call(
            R.drawable.steve_rogers,
            name = "Tio",
            date = "yesterday"
        ),
        Call(
            R.drawable.viuva,
            name = "namorada",
            date = "10 seconds ago"
        ),
        Call(
            R.drawable.banner,
            name = "Sogro",
            date = "1 year ago"
        ),
        Call(
            R.drawable.thor,
            name = "Cunhado",
            date = "two days ago"
        ),
        Call(
            R.drawable.spider,
            name = "Amigo",
            date = "three days ago"
        ),
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        callView = inflater.inflate(R.layout.fragment_calls,container,false)
        return callView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView= callView.findViewById(R.id.rv_calls)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = CallsAdapter(listCalls)
            addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
        }
    }































}