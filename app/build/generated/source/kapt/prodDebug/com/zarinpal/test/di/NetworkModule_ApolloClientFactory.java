package com.zarinpal.test.di;

import com.apollographql.apollo.ApolloClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ApolloClientFactory implements Factory<ApolloClient> {
  @Override
  public ApolloClient get() {
    return apolloClient();
  }

  public static NetworkModule_ApolloClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApolloClient apolloClient() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.apolloClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ApolloClientFactory INSTANCE = new NetworkModule_ApolloClientFactory();
  }
}
