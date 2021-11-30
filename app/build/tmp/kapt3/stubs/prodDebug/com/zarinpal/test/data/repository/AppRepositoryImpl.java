package com.zarinpal.test.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/zarinpal/test/data/repository/AppRepositoryImpl;", "Lcom/zarinpal/test/domain/repository/AppRepository;", "remoteDataSource", "Lcom/zarinpal/test/data/datasource/remote/RemoteDataSource;", "appDao", "Lcom/zarinpal/test/data/datasource/local/AppDao;", "networkConnectivity", "Lcom/zarinpal/test/utils/NetworkConnectivity;", "(Lcom/zarinpal/test/data/datasource/remote/RemoteDataSource;Lcom/zarinpal/test/data/datasource/local/AppDao;Lcom/zarinpal/test/utils/NetworkConnectivity;)V", "getRepositories", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zarinpal/test/data/common/Result;", "Lcom/zarinpal/test/domain/models/RepositoriesModel;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "", "email", "pass", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class AppRepositoryImpl implements com.zarinpal.test.domain.repository.AppRepository {
    private final com.zarinpal.test.data.datasource.remote.RemoteDataSource remoteDataSource = null;
    private final com.zarinpal.test.data.datasource.local.AppDao appDao = null;
    private final com.zarinpal.test.utils.NetworkConnectivity networkConnectivity = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRepositories(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zarinpal.test.data.common.Result<com.zarinpal.test.domain.models.RepositoriesModel>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zarinpal.test.data.common.Result<java.lang.String>>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.datasource.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.datasource.local.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.zarinpal.test.utils.NetworkConnectivity networkConnectivity) {
        super();
    }
}