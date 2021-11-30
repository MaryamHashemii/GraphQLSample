package com.zarinpal.test.data.datasource.remote


import com.zarinpal.test.GetRepositoriesQuery
import com.zarinpal.test.PostLoginMutation
import com.zarinpal.test.data.common.Result

interface RemoteDataSource {
    suspend fun getRepositories(page: Int): Result<GetRepositoriesQuery.Characters?>
    suspend fun login(email:String,pass:String): Result<PostLoginMutation.PostLogin>
}