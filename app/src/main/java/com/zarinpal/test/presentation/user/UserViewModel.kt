package com.zarinpal.test.presentation.user

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.zarinpal.test.data.common.Result
import com.zarinpal.test.data.datasource.sharedPref.UserSharedPref
import com.zarinpal.test.domain.models.UserInfoModel
import com.zarinpal.test.domain.usecases.LoginUseCase
import kotlinx.coroutines.flow.collect


class UserViewModel @ViewModelInject constructor(
    private val loginUseCase: LoginUseCase,
    private val userSharedPref: UserSharedPref

) : ViewModel() {

    private val _loginLiveData = MutableLiveData<Result<String>>()
    val loginLiveData: LiveData<Result<String>> = _loginLiveData

    fun login(userInfoModel: UserInfoModel) = liveData {
        emit(Result.Loading)
        loginUseCase(userInfoModel).collect { result ->
            when (result) {
                is Result.Loading -> {

                }
                is Result.Success -> {
                    userSharedPref.token = result.data
                    _loginLiveData.value = result


                }
                is Result.Error -> {

                }
            }


        }
    }

}