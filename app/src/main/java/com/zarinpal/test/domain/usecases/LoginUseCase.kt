package com.zarinpal.test.domain.usecases

import com.zarinpal.test.data.common.Result
import com.zarinpal.test.di.coroutine.IoDispatcher
import com.zarinpal.test.domain.models.UserInfoModel
import com.zarinpal.test.domain.repository.AppRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : FlowUseCase<UserInfoModel, String>(coroutineDispatcher) {
    override suspend fun execute(parameters: UserInfoModel): Flow<Result<String>> {
        return appRepository.login(parameters.user, parameters.pass)
    }
}