package com.zarinpal.test.di;

import com.zarinpal.test.data.datasource.local.AppDao;
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
public final class RoomModule_ProvideAppDAOFactory implements Factory<AppDao> {
  private final Provider<AppDb> dbProvider;

  public RoomModule_ProvideAppDAOFactory(Provider<AppDb> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public AppDao get() {
    return provideAppDAO(dbProvider.get());
  }

  public static RoomModule_ProvideAppDAOFactory create(Provider<AppDb> dbProvider) {
    return new RoomModule_ProvideAppDAOFactory(dbProvider);
  }

  public static AppDao provideAppDAO(AppDb db) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.provideAppDAO(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
