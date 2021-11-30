package com.zarinpal.test.di;

import com.zarinpal.test.data.datasource.local.AppDao;
import com.zarinpal.test.data.datasource.remote.RemoteDataSourceImpl;
import com.zarinpal.test.domain.repository.AppRepository;
import com.zarinpal.test.utils.NetworkConnectivity;
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
public final class RepositoryModule_ProvideAppRepositoryFactory implements Factory<AppRepository> {
  private final Provider<AppDao> appDaoProvider;

  private final Provider<NetworkConnectivity> connectivityProvider;

  private final Provider<RemoteDataSourceImpl> remoteDataSourceImplProvider;

  public RepositoryModule_ProvideAppRepositoryFactory(Provider<AppDao> appDaoProvider,
      Provider<NetworkConnectivity> connectivityProvider,
      Provider<RemoteDataSourceImpl> remoteDataSourceImplProvider) {
    this.appDaoProvider = appDaoProvider;
    this.connectivityProvider = connectivityProvider;
    this.remoteDataSourceImplProvider = remoteDataSourceImplProvider;
  }

  @Override
  public AppRepository get() {
    return provideAppRepository(appDaoProvider.get(), connectivityProvider.get(), remoteDataSourceImplProvider.get());
  }

  public static RepositoryModule_ProvideAppRepositoryFactory create(Provider<AppDao> appDaoProvider,
      Provider<NetworkConnectivity> connectivityProvider,
      Provider<RemoteDataSourceImpl> remoteDataSourceImplProvider) {
    return new RepositoryModule_ProvideAppRepositoryFactory(appDaoProvider, connectivityProvider, remoteDataSourceImplProvider);
  }

  public static AppRepository provideAppRepository(AppDao appDao, NetworkConnectivity connectivity,
      RemoteDataSourceImpl remoteDataSourceImpl) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideAppRepository(appDao, connectivity, remoteDataSourceImpl), "Cannot return null from a non-@Nullable @Provides method");
  }
}
