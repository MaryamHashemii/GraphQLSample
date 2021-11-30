package com.zarinpal.test.domain.repository

import com.zarinpal.test.data.common.Result
import com.zarinpal.test.domain.models.RepositoriesModel
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    suspend fun getRepositories(page: Int): Flow<Result<RepositoriesModel>>
    suspend fun login(email:String,pass:String): Flow<Result<String>>
}