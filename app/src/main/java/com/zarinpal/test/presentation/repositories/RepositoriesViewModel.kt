package com.zarinpal.test.presentation.repositories

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.zarinpal.test.data.common.Result
import com.zarinpal.test.domain.usecases.GetRepositoriesUseCase
import kotlinx.coroutines.flow.collect


class RepositoriesViewModel @ViewModelInject constructor(
    private val getRepositoriesUseCase: GetRepositoriesUseCase
) : ViewModel() {
    fun getListRepositories(page: Int) = liveData {
        emit(Result.Loading)
        getRepositoriesUseCase(page).collect {
            emit(it)
        }
    }

}
