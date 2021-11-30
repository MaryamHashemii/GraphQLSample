package com.zarinpal.test.data.datasource.sharedPref;

import android.content.Context;
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
public final class UserSharedPref_Factory implements Factory<UserSharedPref> {
  private final Provider<Context> contextProvider;

  public UserSharedPref_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UserSharedPref get() {
    return newInstance(contextProvider.get());
  }

  public static UserSharedPref_Factory create(Provider<Context> contextProvider) {
    return new UserSharedPref_Factory(contextProvider);
  }

  public static UserSharedPref newInstance(Context context) {
    return new UserSharedPref(context);
  }
}
