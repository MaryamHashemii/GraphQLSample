package com.zarinpal.test.data.datasource.remote;

import com.zarinpal.test.data.GraphQlApolloClient;
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
public final class RemoteDataSourceImpl_Factory implements Factory<RemoteDataSourceImpl> {
  private final Provider<GraphQlApolloClient> graphQlApolloClientProvider;

  public RemoteDataSourceImpl_Factory(Provider<GraphQlApolloClient> graphQlApolloClientProvider) {
    this.graphQlApolloClientProvider = graphQlApolloClientProvider;
  }

  @Override
  public RemoteDataSourceImpl get() {
    return newInstance(graphQlApolloClientProvider.get());
  }

  public static RemoteDataSourceImpl_Factory create(
      Provider<GraphQlApolloClient> graphQlApolloClientProvider) {
    return new RemoteDataSourceImpl_Factory(graphQlApolloClientProvider);
  }

  public static RemoteDataSourceImpl newInstance(GraphQlApolloClient graphQlApolloClient) {
    return new RemoteDataSourceImpl(graphQlApolloClient);
  }
}
