package com.zarinpal.test.utils;

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
public final class NetworkConnectivity_Factory implements Factory<NetworkConnectivity> {
  private final Provider<Context> contextProvider;

  public NetworkConnectivity_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkConnectivity get() {
    return newInstance(contextProvider.get());
  }

  public static NetworkConnectivity_Factory create(Provider<Context> contextProvider) {
    return new NetworkConnectivity_Factory(contextProvider);
  }

  public static NetworkConnectivity newInstance(Context context) {
    return new NetworkConnectivity(context);
  }
}
