package com.zarinpal.test.presentation.repositories

import androidx.fragment.app.viewModels
import com.zarinpal.test.R
import com.zarinpal.test.base.BaseDataBindingFragment
import com.zarinpal.test.data.common.Result
import com.zarinpal.test.databinding.FragmentRepositoryBinding
import com.zarinpal.test.domain.models.RepositoriesModel
import com.zarinpal.test.utils.hide
import com.zarinpal.test.utils.show
import com.zarinpal.test.utils.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepositoryFragment :
    BaseDataBindingFragment<FragmentRepositoryBinding>(R.layout.fragment_repository) {
    private val viewModel: RepositoriesViewModel by viewModels()

    override fun setupViews() {
        initObserver()
    }

    private fun initObserver() {
        viewModel.getListRepositories(
         1
        ).observe(viewLifecycleOwner) { result ->
            when (result) {
                is Result.Loading -> {
                    binding.progressCircular.show()
                }
                is Result.Success -> {
                    binding.progressCircular.hide()
                    setListRepositories(result.data)
                }
                is Result.Error -> {
                    context?.toast(result.exception.message.toString())
                }
            }
        }
    }

    private fun setListRepositories(list: RepositoriesModel) {
        with(binding.rvRepositories) {
            adapter = RepositoriesAdapter(list.results)
        }
    }


}