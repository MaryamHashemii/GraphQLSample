package com.zarinpal.test.presentation.user

import androidx.fragment.app.viewModels
import com.zarinpal.test.R
import com.zarinpal.test.base.BaseDataBindingFragment
import com.zarinpal.test.data.common.Result
import com.zarinpal.test.databinding.FragmentUserBinding
import com.zarinpal.test.domain.models.UserInfoModel
import com.zarinpal.test.utils.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment : BaseDataBindingFragment<FragmentUserBinding>(R.layout.fragment_user) {

    private val userViewModel: UserViewModel by viewModels()


    override fun setupViews() {
        binding.btnLogin.setOnClickListener {
            userViewModel.login(
                UserInfoModel(
                    binding.edtUsername.text.toString(),
                    binding.edtPassword.text.toString()
                )
            )
        }

//        if (userViewModel.token.isNullOrEmpty()) {
//            binding.layoutModeNotLogin.visibility = View.VISIBLE
//            binding.layoutModeLogin.visibility = View.GONE
//        } else {
//            binding.layoutModeNotLogin.visibility = View.GONE
//            binding.layoutModeLogin.visibility = View.VISIBLE
//            binding.btnExit.setOnClickListener {
//                userViewModel.exit()
//            }
//        }

    }

    override fun onStart() {
        super.onStart()
        observer()
    }

    private fun observer() {
        userViewModel.loginLiveData.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Result.Loading -> {
                    context?.toast("loading")
                }
                is Result.Success -> {
                    context?.toast("token saved!")
                }
                is Result.Error -> {
                    context?.toast(result.exception.message.toString())
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        binding.edtPassword.text = null
        binding.edtUsername.text = null
    }
}