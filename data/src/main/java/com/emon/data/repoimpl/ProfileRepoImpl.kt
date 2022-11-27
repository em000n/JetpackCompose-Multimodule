package com.emon.data.repoimpl

import com.emon.data.apiservice.GitHubApiService
import com.emon.data.mapper.mapFromApiResponse
import com.emon.data.mapper.profile.ProfileApiMapper
import com.emon.data.wrapper.NetworkBoundResource
import com.emon.domain.base.Result
import com.emon.domain.repository.ProfileRepository
import com.emon.entity.profile.ProfileApiEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProfileRepoImpl @Inject constructor(
    private val gitHubApiService: GitHubApiService,
    private val profileApiMapper: ProfileApiMapper,
    private val networkBoundResources: NetworkBoundResource
) : ProfileRepository {

    override suspend fun fetchProfile(userName:String): Flow<Result<ProfileApiEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                gitHubApiService.fetchProfile(userName)
            },profileApiMapper
        )
    }



}