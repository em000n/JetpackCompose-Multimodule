package com.emon.data.mapper.profile

import com.emon.api_response.profile.ProfileApiResponse
import com.emon.data.mapper.Mapper
import com.emon.entity.profile.ProfileApiEntity
import javax.inject.Inject

class ProfileApiMapper @Inject constructor() :
    Mapper<ProfileApiResponse, ProfileApiEntity> {
    override fun mapFromApiResponseOld(type: ProfileApiResponse): ProfileApiEntity {
        return ProfileApiEntity(
            avatar_url = type.avatar_url,
            bio = type.bio,
            name = type.name,
            login = type.login,
            public_repos = type.public_repos,
            followers = type.followers,
            following = type.following
        )
    }
}