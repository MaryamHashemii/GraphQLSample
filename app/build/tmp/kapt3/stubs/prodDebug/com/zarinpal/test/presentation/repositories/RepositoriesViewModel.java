package com.zarinpal.test.presentation.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/zarinpal/test/presentation/repositories/RepositoriesViewModel;", "Landroidx/lifecycle/ViewModel;", "getRepositoriesUseCase", "Lcom/zarinpal/test/domain/usecases/GetRepositoriesUseCase;", "(Lcom/zarinpal/test/domain/usecases/GetRepositoriesUseCase;)V", "getListRepositories", "Landroidx/lifecycle/LiveData;", "Lcom/zarinpal/test/data/common/Result;", "Lcom/zarinpal/test/domain/models/RepositoriesModel;", "page", "", "app_prodDebug"})
public final class RepositoriesViewModel extends androidx.lifecycle.ViewModel {
    private final com.zarinpal.test.domain.usecases.GetRepositoriesUseCase getRepositoriesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.zarinpal.test.data.common.Result<com.zarinpal.test.domain.models.RepositoriesModel>> getListRepositories(int page) {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public RepositoriesViewModel(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.domain.usecases.GetRepositoriesUseCase getRepositoriesUseCase) {
        super();
    }
}