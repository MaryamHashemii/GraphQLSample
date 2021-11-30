package com.zarinpal.test.presentation.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/zarinpal/test/presentation/user/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUseCase", "Lcom/zarinpal/test/domain/usecases/LoginUseCase;", "userSharedPref", "Lcom/zarinpal/test/data/datasource/sharedPref/UserSharedPref;", "(Lcom/zarinpal/test/domain/usecases/LoginUseCase;Lcom/zarinpal/test/data/datasource/sharedPref/UserSharedPref;)V", "_loginLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zarinpal/test/data/common/Result;", "", "loginLiveData", "Landroidx/lifecycle/LiveData;", "getLoginLiveData", "()Landroidx/lifecycle/LiveData;", "login", "Lcom/zarinpal/test/data/common/Result$Loading;", "userInfoModel", "Lcom/zarinpal/test/domain/models/UserInfoModel;", "app_prodDebug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.zarinpal.test.data.common.Result<java.lang.String>> _loginLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.zarinpal.test.data.common.Result<java.lang.String>> loginLiveData = null;
    private final com.zarinpal.test.domain.usecases.LoginUseCase loginUseCase = null;
    private final com.zarinpal.test.data.datasource.sharedPref.UserSharedPref userSharedPref = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.zarinpal.test.data.common.Result<java.lang.String>> getLoginLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.zarinpal.test.data.common.Result.Loading> login(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.domain.models.UserInfoModel userInfoModel) {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.domain.usecases.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.zarinpal.test.data.datasource.sharedPref.UserSharedPref userSharedPref) {
        super();
    }
}