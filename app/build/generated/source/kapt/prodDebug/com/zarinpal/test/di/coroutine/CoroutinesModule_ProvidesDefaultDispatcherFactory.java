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
public final class CoroutinesModule_ProvidesDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesDefaultDispatcher();
  }

  public static CoroutinesModule_ProvidesDefaultDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesDefaultDispatcher() {
    return Preconditions.checkNotNull(CoroutinesModule.INSTANCE.providesDefaultDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesDefaultDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesDefaultDispatcherFactory();
  }
}
