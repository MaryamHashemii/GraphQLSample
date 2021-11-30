package com.zarinpal.test.data

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.ApolloMutationCall
import com.apollographql.apollo.ApolloQueryCall
import com.apollographql.apollo.api.Input
import com.zarinpal.test.GetRepositoriesQuery
import com.zarinpal.test.PostLoginMutation
import javax.inject.Inject

class GraphQlApolloClient @Inject constructor(
    private val apolloClient: ApolloClient
) {

    fun getRepositories(page: Int): ApolloQueryCall<GetRepositoriesQuery.Data> =
        apolloClient.query(GetRepositoriesQuery(Input.optional(page)))

    fun login(email: String, pass: String): ApolloMutationCall<PostLoginMutation.Data> =
        apolloClient.mutate(PostLoginMutation(email, pass))
}
