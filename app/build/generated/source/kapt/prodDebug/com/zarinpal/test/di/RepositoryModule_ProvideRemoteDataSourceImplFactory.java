package com.zarinpal.test.di;

import com.zarinpal.test.data.GraphQlApolloClient;
import com.zarinpal.test.data.datasource.remote.RemoteDataSourceImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideRemoteDataSourceImplFactory implements Factory<RemoteDataSourceImpl> {
  private final Provider<GraphQlApolloClient> graphQlApolloClientProvider;

  public RepositoryModule_ProvideRemoteDataSourceImplFactory(
      Provider<GraphQlApolloClient> graphQlApolloClientProvider) {
    this.graphQlApolloClientProvider = graphQlApolloClientProvider;
  }

  @Override
  public RemoteDataSourceImpl get() {
    return provideRemoteDataSourceImpl(graphQlApolloClientProvider.get());
  }

  public static RepositoryModule_ProvideRemoteDataSourceImplFactory create(
      Provider<GraphQlApolloClient> graphQlApolloClientProvider) {
    return new RepositoryModule_ProvideRemoteDataSourceImplFactory(graphQlApolloClientProvider);
  }

  public static RemoteDataSourceImpl provideRemoteDataSourceImpl(
      GraphQlApolloClient graphQlApolloClient) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideRemoteDataSourceImpl(graphQlApolloClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
