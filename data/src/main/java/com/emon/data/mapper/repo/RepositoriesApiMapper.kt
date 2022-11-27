package com.emon.data.mapper.repo

import com.emon.api_response.repositories.RepositoriesListApiResponse
import com.emon.data.mapper.Mapper
import com.emon.entity.repositories.*
import javax.inject.Inject

class RepositoriesApiMapper @Inject constructor() :
    Mapper<RepositoriesListApiResponse, RepositoriesListApiEntity> {
    override fun mapFromApiResponseOld(type: RepositoriesListApiResponse): RepositoriesListApiEntity {
        return RepositoriesListApiEntity(
            list = type.map {
                RepositoriesListApiItem(
                    name = it.name ?: "",
                    full_name = it.full_name ?: "",
                    owner = OwnerEntity(
                        avatar_url = it.owner.avatar_url ?: "",
                        login = it.owner.login ?: ""
                    ),
                    forks_count = it.forks_count ?: 0,
                    stargazers_count = it.stargazers_count ?: 0,
                    language = it.language ?: "",
                    description = it.description ?: "Description"
                )
            }
        )
    }
}