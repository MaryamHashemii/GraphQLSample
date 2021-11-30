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
public final class CoroutinesModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesIoDispatcher();
  }

  public static CoroutinesModule_ProvidesIoDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesIoDispatcher() {
    return Preconditions.checkNotNull(CoroutinesModule.INSTANCE.providesIoDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesIoDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesIoDispatcherFactory();
  }
}
