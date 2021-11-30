package com.zarinpal.test.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/zarinpal/test/domain/usecases/LoginUseCase;", "Lcom/zarinpal/test/domain/usecases/FlowUseCase;", "Lcom/zarinpal/test/domain/models/UserInfoModel;", "", "appRepository", "Lcom/zarinpal/test/domain/repository/AppRepository;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/zarinpal/test/domain/repository/AppRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zarinpal/test/data/common/Result;", "parameters", "(Lcom/zarinpal/test/domain/models/UserInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class LoginUseCase extends com.zarinpal.test.domain.usecases.FlowUseCase<com.zarinpal.test.domain.models.UserInfoModel, java.lang.String> {
    private final com.zarinpal.test.domain.repository.AppRepository appRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.domain.models.UserInfoModel parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zarinpal.test.data.common.Result<java.lang.String>>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoginUseCase(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.domain.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @com.zarinpal.test.di.coroutine.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null);
    }
}