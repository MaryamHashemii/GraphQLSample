package com.zarinpal.test.data.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\b\tB\u0011\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/zarinpal/test/data/common/DataSourceException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "messageResource", "", "(Ljava/lang/Object;)V", "getMessageResource", "()Ljava/lang/Object;", "Server", "Unexpected", "Lcom/zarinpal/test/data/common/DataSourceException$Unexpected;", "Lcom/zarinpal/test/data/common/DataSourceException$Server;", "app_prodDebug"})
public abstract class DataSourceException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object messageResource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMessageResource() {
        return null;
    }
    
    private DataSourceException(java.lang.Object messageResource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zarinpal/test/data/common/DataSourceException$Unexpected;", "Lcom/zarinpal/test/data/common/DataSourceException;", "messageResource", "", "(I)V", "app_prodDebug"})
    public static final class Unexpected extends com.zarinpal.test.data.common.DataSourceException {
        
        public Unexpected(int messageResource) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zarinpal/test/data/common/DataSourceException$Server;", "Lcom/zarinpal/test/data/common/DataSourceException;", "error", "Lcom/apollographql/apollo/api/Error;", "(Lcom/apollographql/apollo/api/Error;)V", "app_prodDebug"})
    public static final class Server extends com.zarinpal.test.data.common.DataSourceException {
        
        public Server(@org.jetbrains.annotations.Nullable()
        com.apollographql.apollo.api.Error error) {
            super(null);
        }
    }
}