package com.zarinpal.test.domain.usecases

import com.zarinpal.test.data.common.Result
import com.zarinpal.test.di.coroutine.IoDispatcher
import com.zarinpal.test.domain.models.RepositoriesModel
import com.zarinpal.test.domain.repository.AppRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRepositoriesUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
):FlowUseCase<Int, RepositoriesModel> (coroutineDispatcher){
    override suspend fun execute(parameters: Int): Flow<Result<RepositoriesModel>> {
        return appRepository.getRepositories(parameters)
    }
}