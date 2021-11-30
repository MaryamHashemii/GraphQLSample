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
public final class LoginUseCase_Factory implements Factory<LoginUseCase> {
  private final Provider<AppRepository> appRepositoryProvider;

  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  public LoginUseCase_Factory(Provider<AppRepository> appRepositoryProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
  }

  @Override
  public LoginUseCase get() {
    return newInstance(appRepositoryProvider.get(), coroutineDispatcherProvider.get());
  }

  public static LoginUseCase_Factory create(Provider<AppRepository> appRepositoryProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    return new LoginUseCase_Factory(appRepositoryProvider, coroutineDispatcherProvider);
  }

  public static LoginUseCase newInstance(AppRepository appRepository,
      CoroutineDispatcher coroutineDispatcher) {
    return new LoginUseCase(appRepository, coroutineDispatcher);
  }
}
