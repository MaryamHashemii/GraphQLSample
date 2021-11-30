package com.zarinpal.test.domain.models

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Entity(tableName = "repository", primaryKeys = ["id"])
@Parcelize
data class SingleRepositoryModel(
    val id: String,
    val name: String,
    val image: String,
) : Parcelable