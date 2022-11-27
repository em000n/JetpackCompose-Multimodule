package com.emon.entity.profile

data class ProfileApiEntity(
    val avatar_url: String,
    val name: String,
    val login: String,
    val bio: String,
    val public_repos: Int,
    val followers: Int,
    val following: Int,
)
