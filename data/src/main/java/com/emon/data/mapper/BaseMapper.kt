package com.emon.data.mapper

import com.emon.domain.base.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

interface Mapper<R,E>{
    fun mapFromApiResponseOld(type:R):E
}

fun<R,E> mapFromApiResponse(result: Flow<Result<R>>, mapper: Mapper<R, E>): Flow<Result<E>> {
    return result.map {
        when(it){
            is Result.Success-> Result.Success(mapper.mapFromApiResponseOld(it.data))
            is Result.Error-> Result.Error(it.message,it.code)
            is Result.Loading -> Result.Loading(it.loading)
        }
    }
}

