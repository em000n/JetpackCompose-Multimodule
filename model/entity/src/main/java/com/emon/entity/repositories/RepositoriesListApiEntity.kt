package com.emon.entity.repositories
data class RepositoriesListApiEntity(
    val list: List<RepositoriesListApiItem>
)
data class RepositoriesListApiItem(
    val name: String,
    val full_name: String,
    val owner: OwnerEntity,
    val forks_count: Int,
    val stargazers_count: Int,
    val language: String,
    val description: String,
)

data class OwnerEntity(
    val avatar_url: String,
    val login: String,
)
