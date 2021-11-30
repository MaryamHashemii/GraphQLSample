package com.zarinpal.test.data.mappers


import com.zarinpal.test.GetRepositoriesQuery
import com.zarinpal.test.PostLoginMutation
import com.zarinpal.test.domain.models.*

fun GetRepositoriesQuery.Info.mapToDomainModel() = InfoModel(pages ?: 0, )

fun GetRepositoriesQuery.Result.mapToDomainModel() = SingleRepositoryModel(
    id ?: "",
    name ?: "",
    image ?: "",
)

fun GetRepositoriesQuery.Characters.mapToDomainModel() = RepositoriesModel(
    info?.mapToDomainModel() ?: InfoModel(),
    results?.map { it!!.mapToDomainModel() } ?: emptyList()
)

fun PostLoginMutation.PostLogin.mapToDomainModel()= tkn