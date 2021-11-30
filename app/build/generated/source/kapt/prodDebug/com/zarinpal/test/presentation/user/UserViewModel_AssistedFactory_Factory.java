package com.zarinpal.test.presentation.user;

import com.zarinpal.test.data.datasource.sharedPref.UserSharedPref;
import com.zarinpal.test.domain.usecases.LoginUseCase;
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
public final class UserViewModel_AssistedFactory_Factory implements Factory<UserViewModel_AssistedFactory> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<UserSharedPref> userSharedPrefProvider;

  public UserViewModel_AssistedFactory_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<UserSharedPref> userSharedPrefProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.userSharedPrefProvider = userSharedPrefProvider;
  }

  @Override
  public UserViewModel_AssistedFactory get() {
    return newInstance(loginUseCaseProvider, userSharedPrefProvider);
  }

  public static UserViewModel_AssistedFactory_Factory create(
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<UserSharedPref> userSharedPrefProvider) {
    return new UserViewModel_AssistedFactory_Factory(loginUseCaseProvider, userSharedPrefProvider);
  }

  public static UserViewModel_AssistedFactory newInstance(Provider<LoginUseCase> loginUseCase,
      Provider<UserSharedPref> userSharedPref) {
    return new UserViewModel_AssistedFactory(loginUseCase, userSharedPref);
  }
}
