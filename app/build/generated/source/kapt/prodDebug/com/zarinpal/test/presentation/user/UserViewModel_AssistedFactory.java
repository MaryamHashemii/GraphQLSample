package com.zarinpal.test.presentation.user;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.zarinpal.test.data.datasource.sharedPref.UserSharedPref;
import com.zarinpal.test.domain.usecases.LoginUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class UserViewModel_AssistedFactory implements ViewModelAssistedFactory<UserViewModel> {
  private final Provider<LoginUseCase> loginUseCase;

  private final Provider<UserSharedPref> userSharedPref;

  @Inject
  UserViewModel_AssistedFactory(Provider<LoginUseCase> loginUseCase,
      Provider<UserSharedPref> userSharedPref) {
    this.loginUseCase = loginUseCase;
    this.userSharedPref = userSharedPref;
  }

  @Override
  @NonNull
  public UserViewModel create(SavedStateHandle arg0) {
    return new UserViewModel(loginUseCase.get(), userSharedPref.get());
  }
}
