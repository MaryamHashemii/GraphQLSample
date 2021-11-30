package com.zarinpal.test.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b2\u0006\u0010\n\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b2\u0006\u0010\n\u001a\u00028\u0000H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/zarinpal/test/domain/usecases/FlowUseCase;", "P", "R", "", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zarinpal/test/data/common/Result;", "parameters", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "app_prodDebug"})
public abstract class FlowUseCase<P extends java.lang.Object, R extends java.lang.Object> {
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(P parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zarinpal.test.data.common.Result<? extends R>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object execute(P parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zarinpal.test.data.common.Result<? extends R>>> p1);
    
    public FlowUseCase(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
}