package com.zarinpal.test.di

import com.zarinpal.test.data.GraphQlApolloClient
import com.zarinpal.test.data.datasource.local.AppDao
import com.zarinpal.test.data.datasource.remote.RemoteDataSourceImpl
import com.zarinpal.test.data.repository.AppRepositoryImpl
import com.zarinpal.test.domain.repository.AppRepository
import com.zarinpal.test.utils.NetworkConnectivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAppRepository(appDao: AppDao,connectivity: NetworkConnectivity,remoteDataSourceImpl: RemoteDataSourceImpl): AppRepository {
        return AppRepositoryImpl(remoteDataSourceImpl, appDao,connectivity)
    }

    @Provides
    @Singleton
    fun provideRemoteDataSourceImpl(graphQlApolloClient: GraphQlApolloClient):RemoteDataSourceImpl{
        return RemoteDataSourceImpl(graphQlApolloClient)
    }
}