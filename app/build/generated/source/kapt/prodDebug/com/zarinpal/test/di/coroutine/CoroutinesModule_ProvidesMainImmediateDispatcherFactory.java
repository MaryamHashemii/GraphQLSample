package com.zarinpal.test.di.coroutine;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesModule_ProvidesMainImmediateDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesMainImmediateDispatcher();
  }

  public static CoroutinesModule_ProvidesMainImmediateDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesMainImmediateDispatcher() {
    return Preconditions.checkNotNull(CoroutinesModule.INSTANCE.providesMainImmediateDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesMainImmediateDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesMainImmediateDispatcherFactory();
  }
}
