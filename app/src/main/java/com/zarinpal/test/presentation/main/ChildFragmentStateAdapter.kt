package com.zarinpal.test.presentation.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zarinpal.test.presentation.user.UserFragment
import com.zarinpal.test.presentation.repositories.RepositoryFragment

class ChildFragmentStateAdapter(private val fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {


        return when (position) {
            0 -> RepositoryFragment()
            1 ->  UserFragment()
            else ->RepositoryFragment()
        }
    }

}