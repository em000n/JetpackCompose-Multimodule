package com.emon.domain.repository

import com.emon.domain.base.Result
import com.emon.entity.profile.ProfileApiEntity
import kotlinx.coroutines.flow.Flow

interface ProfileRepository {
    suspend fun fetchProfile(userName:String):Flow<Result<ProfileApiEntity>>

}