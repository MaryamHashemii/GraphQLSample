package com.zarinpal.test.presentation.repositories;

import com.zarinpal.test.domain.usecases.GetRepositoriesUseCase;
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
public final class RepositoriesViewModel_AssistedFactory_Factory implements Factory<RepositoriesViewModel_AssistedFactory> {
  private final Provider<GetRepositoriesUseCase> getRepositoriesUseCaseProvider;

  public RepositoriesViewModel_AssistedFactory_Factory(
      Provider<GetRepositoriesUseCase> getRepositoriesUseCaseProvider) {
    this.getRepositoriesUseCaseProvider = getRepositoriesUseCaseProvider;
  }

  @Override
  public RepositoriesViewModel_AssistedFactory get() {
    return newInstance(getRepositoriesUseCaseProvider);
  }

  public static RepositoriesViewModel_AssistedFactory_Factory create(
      Provider<GetRepositoriesUseCase> getRepositoriesUseCaseProvider) {
    return new RepositoriesViewModel_AssistedFactory_Factory(getRepositoriesUseCaseProvider);
  }

  public static RepositoriesViewModel_AssistedFactory newInstance(
      Provider<GetRepositoriesUseCase> getRepositoriesUseCase) {
    return new RepositoriesViewModel_AssistedFactory(getRepositoriesUseCase);
  }
}
