package com.zarinpal.test.domain.usecases;

import com.zarinpal.test.domain.repository.AppRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetRepositoriesUseCase_Factory implements Factory<GetRepositoriesUseCase> {
  private final Provider<AppRepository> appRepositoryProvider;

  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  public GetRepositoriesUseCase_Factory(Provider<AppRepository> appRepositoryProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
  }

  @Override
  public GetRepositoriesUseCase get() {
    return newInstance(appRepositoryProvider.get(), coroutineDispatcherProvider.get());
  }

  public static GetRepositoriesUseCase_Factory create(Provider<AppRepository> appRepositoryProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    return new GetRepositoriesUseCase_Factory(appRepositoryProvider, coroutineDispatcherProvider);
  }

  public static GetRepositoriesUseCase newInstance(AppRepository appRepository,
      CoroutineDispatcher coroutineDispatcher) {
    return new GetRepositoriesUseCase(appRepository, coroutineDispatcher);
  }
}
