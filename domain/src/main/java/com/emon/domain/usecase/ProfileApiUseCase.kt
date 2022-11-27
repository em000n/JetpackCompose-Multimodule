package com.emon.domain.usecase

import com.emon.domain.base.ApiUseCaseParams
import com.emon.domain.base.Result
import com.emon.domain.repository.ProfileRepository
import com.emon.entity.profile.ProfileApiEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProfileApiUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
) : ApiUseCaseParams<String, ProfileApiEntity> {

    override suspend fun execute(params: String): Flow<Result<ProfileApiEntity>> {
        return profileRepository.fetchProfile(params)
    }
}