package com.zarinpal.test.data.repository;

import com.zarinpal.test.data.datasource.local.AppDao;
import com.zarinpal.test.data.datasource.remote.RemoteDataSource;
import com.zarinpal.test.utils.NetworkConnectivity;
import dagger.internal.Factory;
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
public final class AppRepositoryImpl_Factory implements Factory<AppRepositoryImpl> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<AppDao> appDaoProvider;

  private final Provider<NetworkConnectivity> networkConnectivityProvider;

  public AppRepositoryImpl_Factory(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<AppDao> appDaoProvider, Provider<NetworkConnectivity> networkConnectivityProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.appDaoProvider = appDaoProvider;
    this.networkConnectivityProvider = networkConnectivityProvider;
  }

  @Override
  public AppRepositoryImpl get() {
    return newInstance(remoteDataSourceProvider.get(), appDaoProvider.get(), networkConnectivityProvider.get());
  }

  public static AppRepositoryImpl_Factory create(
      Provider<RemoteDataSource> remoteDataSourceProvider, Provider<AppDao> appDaoProvider,
      Provider<NetworkConnectivity> networkConnectivityProvider) {
    return new AppRepositoryImpl_Factory(remoteDataSourceProvider, appDaoProvider, networkConnectivityProvider);
  }

  public static AppRepositoryImpl newInstance(RemoteDataSource remoteDataSource, AppDao appDao,
      NetworkConnectivity networkConnectivity) {
    return new AppRepositoryImpl(remoteDataSource, appDao, networkConnectivity);
  }
}
