package com.zarinpal.test.data.datasource.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/zarinpal/test/data/datasource/remote/RemoteDataSourceImpl;", "Lcom/zarinpal/test/data/datasource/remote/RemoteDataSource;", "graphQlApolloClient", "Lcom/zarinpal/test/data/GraphQlApolloClient;", "(Lcom/zarinpal/test/data/GraphQlApolloClient;)V", "getRepositories", "Lcom/zarinpal/test/data/common/Result;", "Lcom/zarinpal/test/GetRepositoriesQuery$Characters;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/zarinpal/test/PostLoginMutation$PostLogin;", "email", "", "pass", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class RemoteDataSourceImpl implements com.zarinpal.test.data.datasource.remote.RemoteDataSource {
    private final com.zarinpal.test.data.GraphQlApolloClient graphQlApolloClient = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRepositories(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zarinpal.test.data.common.Result<com.zarinpal.test.GetRepositoriesQuery.Characters>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zarinpal.test.data.common.Result<com.zarinpal.test.PostLoginMutation.PostLogin>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public RemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.GraphQlApolloClient graphQlApolloClient) {
        super();
    }
}