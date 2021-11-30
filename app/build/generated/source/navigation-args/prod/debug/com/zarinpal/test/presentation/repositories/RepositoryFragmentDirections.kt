package com.zarinpal.test.presentation.repositories

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.zarinpal.test.R

public class RepositoryFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragment2ToHomeFragment12(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment2_to_homeFragment12)
  }
}
