package com.zarinpal.test.presentation.main

import com.zarinpal.test.R
import com.zarinpal.test.base.BaseDataBindingActivity
import com.zarinpal.test.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: BaseDataBindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun setupViews() {
        listenBackStackChange()
    }

    private fun listenBackStackChange() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment)

        val navHostChildFragmentManager = navHostFragment?.childFragmentManager

        navHostChildFragmentManager?.addOnBackStackChangedListener {

            val backStackEntryCount = navHostChildFragmentManager.backStackEntryCount
            val fragments = navHostChildFragmentManager.fragments



        }
    }

}