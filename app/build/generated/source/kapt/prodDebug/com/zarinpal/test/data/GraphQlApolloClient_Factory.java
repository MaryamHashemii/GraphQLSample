package com.zarinpal.test.data;

import com.apollographql.apollo.ApolloClient;
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
public final class GraphQlApolloClient_Factory implements Factory<GraphQlApolloClient> {
  private final Provider<ApolloClient> apolloClientProvider;

  public GraphQlApolloClient_Factory(Provider<ApolloClient> apolloClientProvider) {
    this.apolloClientProvider = apolloClientProvider;
  }

  @Override
  public GraphQlApolloClient get() {
    return newInstance(apolloClientProvider.get());
  }

  public static GraphQlApolloClient_Factory create(Provider<ApolloClient> apolloClientProvider) {
    return new GraphQlApolloClient_Factory(apolloClientProvider);
  }

  public static GraphQlApolloClient newInstance(ApolloClient apolloClient) {
    return new GraphQlApolloClient(apolloClient);
  }
}
