package com.emon.domain.usecase

import com.emon.domain.base.ApiUseCaseParams
import com.emon.domain.base.Result
import com.emon.domain.repository.RepositoriesRepository
import com.emon.entity.repositories.RepositoriesListApiEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoriesApiUseCase @Inject constructor(
    private val repositoriesRepository: RepositoriesRepository
) : ApiUseCaseParams<String, RepositoriesListApiEntity> {

    override suspend fun execute(params: String): Flow<Result<RepositoriesListApiEntity>> {
        return repositoriesRepository.fetchRepoList(params)
    }
}