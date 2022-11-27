package com.emon.domain.base

interface UseCase

interface CoroutineUseCase<Params, Type>:UseCase{
    suspend fun execute(params: Params? = null):Type
}

interface LocalLiveDataUseCase <Params, Type>:UseCase{
    fun execute(params: Params? = null):Type
}

interface RoomUseCaseNonParams<Type> : UseCase {
    suspend fun execute(): Type
}
