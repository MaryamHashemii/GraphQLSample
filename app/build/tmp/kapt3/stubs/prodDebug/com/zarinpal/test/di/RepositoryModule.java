package com.zarinpal.test.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/zarinpal/test/di/RepositoryModule;", "", "()V", "provideAppRepository", "Lcom/zarinpal/test/domain/repository/AppRepository;", "appDao", "Lcom/zarinpal/test/data/datasource/local/AppDao;", "connectivity", "Lcom/zarinpal/test/utils/NetworkConnectivity;", "remoteDataSourceImpl", "Lcom/zarinpal/test/data/datasource/remote/RemoteDataSourceImpl;", "provideRemoteDataSourceImpl", "graphQlApolloClient", "Lcom/zarinpal/test/data/GraphQlApolloClient;", "app_prodDebug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.zarinpal.test.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.zarinpal.test.domain.repository.AppRepository provideAppRepository(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.datasource.local.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.zarinpal.test.utils.NetworkConnectivity connectivity, @org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.datasource.remote.RemoteDataSourceImpl remoteDataSourceImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.zarinpal.test.data.datasource.remote.RemoteDataSourceImpl provideRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.GraphQlApolloClient graphQlApolloClient) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}