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
public final class CoroutinesModule_ProvidesMainDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesMainDispatcher();
  }

  public static CoroutinesModule_ProvidesMainDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesMainDispatcher() {
    return Preconditions.checkNotNull(CoroutinesModule.INSTANCE.providesMainDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesMainDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesMainDispatcherFactory();
  }
}
