package com.zarinpal.test.di;

import android.content.Context;
import com.zarinpal.test.data.datasource.local.AppDb;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvideAppDatabaseFactory implements Factory<AppDb> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvideAppDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDb get() {
    return provideAppDatabase(contextProvider.get());
  }

  public static RoomModule_ProvideAppDatabaseFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvideAppDatabaseFactory(contextProvider);
  }

  public static AppDb provideAppDatabase(Context context) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.provideAppDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
