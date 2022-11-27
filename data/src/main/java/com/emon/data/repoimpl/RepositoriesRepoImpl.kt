package com.emon.data.repoimpl

import com.emon.data.wrapper.NetworkBoundResource
import com.emon.data.apiservice.GitHubApiService
import com.emon.data.mapper.mapFromApiResponse
import com.emon.data.mapper.repo.RepositoriesApiMapper
import com.emon.domain.base.Result
import com.emon.domain.repository.RepositoriesRepository
import com.emon.entity.repositories.RepositoriesListApiEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoriesRepoImpl @Inject constructor(
    private val gitHubApiService: GitHubApiService,
    private val repositoriesApiMapper: RepositoriesApiMapper,
    private val networkBoundResources: NetworkBoundResource
) : RepositoriesRepository {

    override suspend fun fetchRepoList(userName:String): Flow<Result<RepositoriesListApiEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                gitHubApiService.fetchRepoList(userName)
            },repositoriesApiMapper
        )
    }
}