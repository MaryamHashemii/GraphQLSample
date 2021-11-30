package com.zarinpal.test.presentation.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.zarinpal.test.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashFragmentToMainDest(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_main_dest)
  }
}
