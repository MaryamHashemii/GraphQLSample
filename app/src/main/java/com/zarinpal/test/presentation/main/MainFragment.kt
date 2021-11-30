package com.zarinpal.test.presentation.main

import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator
import com.zarinpal.test.R
import com.zarinpal.test.base.BaseDataBindingFragment
import com.zarinpal.test.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseDataBindingFragment<FragmentMainBinding>(R.layout.fragment_main) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)

        viewPager?.adapter = ChildFragmentStateAdapter(this)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.label_repository)
                1 -> tab.text = getString(R.string.label_user)
            }
        }.attach()

    }

    override fun setupViews() {
    }


}