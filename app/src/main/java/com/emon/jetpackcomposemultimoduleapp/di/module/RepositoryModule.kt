package com.emon.jetpackcomposemultimoduleapp.di.module

import com.emon.data.repoimpl.ProfileRepoImpl
import com.emon.data.repoimpl.RepositoriesRepoImpl
import com.emon.domain.repository.ProfileRepository
import com.emon.domain.repository.RepositoriesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun bindRepositoriesRepository(repositoriesRepoImpl: RepositoriesRepoImpl): RepositoriesRepository

    @Binds
    fun bindProfileRepository(profileRepoImpl: ProfileRepoImpl): ProfileRepository
}