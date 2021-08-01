package com.naniak.whatsappmock.viewpager.status

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.naniak.whatsappmock.R
import com.naniak.whatsappmock.databinding.FragmentStatusBinding
import com.naniak.whatsappmock.viewpager.chat.adapter.ChatAdapter
import com.naniak.whatsappmock.viewpager.status.adapter.Status
import com.naniak.whatsappmock.viewpager.status.adapter.StatusAdapter


class StatusFragment : Fragment() {
    private var binding: FragmentStatusBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         val listStatus = arrayListOf(
            Status(
                R.drawable.tony_stark,
                name = "Amigo",
                date = "Today : 11:42pm"
            ),
            Status(
                R.drawable.steve_rogers,
                name = "Tio",
                date = "12:33 pm "
            ),
            Status(
                R.drawable.banner,
                name = "Sogro",
                date = "yesterday : 22:21 "
            ),
            Status(
                R.drawable.spider,
                name = "Amigo",
                date = " Year ago : 22:21 "
            ),
        )



        binding?.let {
            with(it) {
                rvStatus.layoutManager = LinearLayoutManager(context)
                rvStatus.adapter = StatusAdapter(listStatus)

            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()

        binding = null
    }
}