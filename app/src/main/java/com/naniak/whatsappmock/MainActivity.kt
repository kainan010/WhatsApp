package com.naniak.whatsappmock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.naniak.whatsappmock.databinding.ActivityMainBinding
import com.naniak.whatsappmock.viewpager.adapter.ViewPagerAdapter
import com.naniak.whatsappmock.viewpager.calls.CallsFragment
import com.naniak.whatsappmock.viewpager.chat.ChatFragment
import com.naniak.whatsappmock.viewpager.status.StatusFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val chatFragment = ChatFragment()
        val statusFragment = StatusFragment()
        val callsFragment = CallsFragment()
        val fragments = listOf(chatFragment, statusFragment, callsFragment)


        val viewPagerAdapter = ViewPagerAdapter(
            activity = this,
            fragments = fragments
        )

        binding.pagerMain.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tabMain, binding.pagerMain) { tab, position ->
            when (position) {
                0 -> tab.text = "Chats"
                1 -> tab.text = "Status"
                2 -> tab.text = "Calls"
            }
        }.attach()
    }

}




