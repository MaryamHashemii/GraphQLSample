package com.zarinpal.test.data.datasource.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/zarinpal/test/data/datasource/remote/RemoteDataSource;", "", "getRepositories", "Lcom/zarinpal/test/data/common/Result;", "Lcom/zarinpal/test/GetRepositoriesQuery$Characters;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/zarinpal/test/PostLoginMutation$PostLogin;", "email", "", "pass", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface RemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRepositories(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zarinpal.test.data.common.Result<com.zarinpal.test.GetRepositoriesQuery.Characters>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zarinpal.test.data.common.Result<com.zarinpal.test.PostLoginMutation.PostLogin>> p2);
}