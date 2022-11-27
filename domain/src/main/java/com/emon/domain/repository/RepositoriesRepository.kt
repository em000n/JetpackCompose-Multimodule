package com.emon.domain.repository

import com.emon.domain.base.Result
import com.emon.entity.repositories.RepositoriesListApiEntity
import kotlinx.coroutines.flow.Flow

interface RepositoriesRepository {
    suspend fun fetchRepoList(userName:String):Flow<Result<RepositoriesListApiEntity>>

}