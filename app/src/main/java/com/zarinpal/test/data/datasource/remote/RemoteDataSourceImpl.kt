package com.zarinpal.test.data.datasource.remote

import com.apollographql.apollo.coroutines.await
import com.zarinpal.test.GetRepositoriesQuery
import com.zarinpal.test.PostLoginMutation
import com.zarinpal.test.R
import com.zarinpal.test.data.GraphQlApolloClient
import com.zarinpal.test.data.common.DataSourceException
import com.zarinpal.test.data.common.Result
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val graphQlApolloClient: GraphQlApolloClient
) : RemoteDataSource {

    override suspend fun getRepositories(page: Int): Result<GetRepositoriesQuery.Characters?> {
        return try {
            val result = graphQlApolloClient.getRepositories(page).await()
            if (result.hasErrors()) {
                Result.Error(DataSourceException.Server(result.errors?.first()))
            } else {
                Result.Success(result.data?.characters)
            }
        } catch (e: Exception) {
            Result.Error(DataSourceException.Unexpected(R.string.label_error_unexpected_message))
        }
    }

    override suspend fun login(
        email: String,
        pass: String
    ): Result<PostLoginMutation.PostLogin> {
        return try {
            val result = graphQlApolloClient.login(email, pass).await()
            if (result.hasErrors()) {
                Result.Error(DataSourceException.Server(result.errors?.first()))
            } else {
                Result.Success(result.data?.postLogin!!)
            }
        } catch (e: Exception) {
            Result.Error(DataSourceException.Unexpected(R.string.label_error_unexpected_message))
        }
    }
}