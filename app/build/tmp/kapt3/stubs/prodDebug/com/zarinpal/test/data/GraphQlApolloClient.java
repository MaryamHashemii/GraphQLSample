package com.zarinpal.test.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/zarinpal/test/data/GraphQlApolloClient;", "", "apolloClient", "Lcom/apollographql/apollo/ApolloClient;", "(Lcom/apollographql/apollo/ApolloClient;)V", "getRepositories", "Lcom/apollographql/apollo/ApolloQueryCall;", "Lcom/zarinpal/test/GetRepositoriesQuery$Data;", "page", "", "login", "Lcom/apollographql/apollo/ApolloMutationCall;", "Lcom/zarinpal/test/PostLoginMutation$Data;", "email", "", "pass", "app_prodDebug"})
public final class GraphQlApolloClient {
    private final com.apollographql.apollo.ApolloClient apolloClient = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.apollographql.apollo.ApolloQueryCall<com.zarinpal.test.GetRepositoriesQuery.Data> getRepositories(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.apollographql.apollo.ApolloMutationCall<com.zarinpal.test.PostLoginMutation.Data> login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
        return null;
    }
    
    @javax.inject.Inject()
    public GraphQlApolloClient(@org.jetbrains.annotations.NotNull()
    com.apollographql.apollo.ApolloClient apolloClient) {
        super();
    }
}