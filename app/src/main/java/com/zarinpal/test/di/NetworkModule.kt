package com.zarinpal.test.di

import com.apollographql.apollo.ApolloClient
import com.zarinpal.test.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
     fun apolloClient(): ApolloClient =
        ApolloClient.builder().serverUrl(BuildConfig.BASE_URL).build()
}