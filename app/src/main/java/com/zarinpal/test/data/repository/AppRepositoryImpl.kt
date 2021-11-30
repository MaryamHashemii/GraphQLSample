package com.zarinpal.test.data.repository

import com.zarinpal.test.data.common.Result
import com.zarinpal.test.data.datasource.local.AppDao
import com.zarinpal.test.data.datasource.remote.RemoteDataSource
import com.zarinpal.test.data.mappers.mapToDomainModel
import com.zarinpal.test.domain.models.RepositoriesModel
import com.zarinpal.test.domain.models.InfoModel
import com.zarinpal.test.domain.repository.AppRepository
import com.zarinpal.test.utils.NetworkConnectivity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val appDao: AppDao,
    private val networkConnectivity: NetworkConnectivity
) :
    AppRepository {
    override suspend fun getRepositories(page: Int): Flow<Result<RepositoriesModel>> =
        flow {
            when (val result = remoteDataSource.getRepositories(page)) {
                is Result.Success -> {
                    result.data?.let {
                        it.mapToDomainModel().apply {
                            appDao.saveListRepositories(results)
                            emit(Result.Success(this))
                        }
                    }
                }
                is Result.Error -> {
                    val listRepositories = appDao.getListRepositories()
                    if (listRepositories.isNotEmpty()) {
                        emit(
                            Result.Success(
                                RepositoriesModel(
                                    InfoModel(),
                                    listRepositories
                                )
                            )
                        )
                    } else {
                        emit(Result.Error(result.exception))
                    }
                }
            }
        }.onStart { emit(Result.Loading) }

    override suspend fun login(email: String, pass: String): Flow<Result<String>> =
        flow {
            when (val result = remoteDataSource.login(email, pass)) {
                is Result.Success -> {
                    result.data?.let {
                        it.mapToDomainModel().apply {
                            emit(Result.Success(this))
                        }
                    }
                }

                is Result.Error -> {
                    emit(Result.Error(result.exception))
                }
            }

        }.onStart { emit(Result.Loading) }

}
