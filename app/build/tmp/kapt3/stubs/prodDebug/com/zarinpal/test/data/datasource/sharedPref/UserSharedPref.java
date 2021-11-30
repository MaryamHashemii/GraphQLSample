package com.zarinpal.test.data.datasource.sharedPref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/zarinpal/test/data/datasource/sharedPref/UserSharedPref;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "sharedPref", "Landroid/content/SharedPreferences;", "value", "", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "UserSharedPrefKeys", "app_prodDebug"})
public final class UserSharedPref {
    private final android.content.SharedPreferences sharedPref = null;
    private final android.content.SharedPreferences.Editor editor = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @javax.inject.Inject()
    public UserSharedPref(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/zarinpal/test/data/datasource/sharedPref/UserSharedPref$UserSharedPrefKeys;", "", "()V", "TOKEN", "", "USER_PREF_NAME", "app_prodDebug"})
    public static final class UserSharedPrefKeys {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PREF_NAME = "user_pref";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TOKEN = "token";
        @org.jetbrains.annotations.NotNull()
        public static final com.zarinpal.test.data.datasource.sharedPref.UserSharedPref.UserSharedPrefKeys INSTANCE = null;
        
        private UserSharedPrefKeys() {
            super();
        }
    }
}