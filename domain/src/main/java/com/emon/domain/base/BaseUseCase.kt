package com.emon.domain.base

import androidx.lifecycle.LiveData
import com.emon.entity.response.ApiResponse
import kotlinx.coroutines.flow.Flow

interface BaseUseCase
interface ApiUseCase<Params, Type> : BaseUseCase {
    fun execute(params: Params? = null): LiveData<ApiResponse<Type>>
}

interface ApiUseCaseParams<Params, Type> : UseCase {
    suspend fun execute(params: Params): Flow<Result<Type>>
}

interface ApiUseCaseNonParams<Type> : UseCase {
    suspend fun execute(): Flow<Result<Type>>
}

interface ApiUseCaseNonParamsV2<Type> : UseCase {
    suspend fun execute(): Flow<Result<Type>>
}