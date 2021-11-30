package com.zarinpal.test.presentation.repositories;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.zarinpal.test.domain.usecases.GetRepositoriesUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class RepositoriesViewModel_AssistedFactory implements ViewModelAssistedFactory<RepositoriesViewModel> {
  private final Provider<GetRepositoriesUseCase> getRepositoriesUseCase;

  @Inject
  RepositoriesViewModel_AssistedFactory(Provider<GetRepositoriesUseCase> getRepositoriesUseCase) {
    this.getRepositoriesUseCase = getRepositoriesUseCase;
  }

  @Override
  @NonNull
  public RepositoriesViewModel create(SavedStateHandle arg0) {
    return new RepositoriesViewModel(getRepositoriesUseCase.get());
  }
}
