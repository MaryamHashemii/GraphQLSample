package com.zarinpal.test.data.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.zarinpal.test.domain.models.SingleRepositoryModel

@Dao
interface AppDao {

    @Query("SELECT * FROM repository")
    suspend fun getListRepositories(): List<SingleRepositoryModel>

    @Insert(onConflict = REPLACE)
    suspend fun saveListRepositories(listTrivia: List<SingleRepositoryModel>)
}