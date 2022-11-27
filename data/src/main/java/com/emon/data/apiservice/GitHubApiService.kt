package com.emon.data.apiservice

import com.emon.api_response.profile.ProfileApiResponse
import com.emon.api_response.repositories.RepositoriesListApiResponse
import retrofit2.Response
import retrofit2.http.*

interface GitHubApiService {
    @GET("/users/{username}/repos")
    suspend fun fetchRepoList(
        @Path("username")username:String
    ): Response<RepositoriesListApiResponse>

    @GET("/users/{username}")
    suspend fun fetchProfile(
        @Path("username")username:String
    ):Response<ProfileApiResponse>
}