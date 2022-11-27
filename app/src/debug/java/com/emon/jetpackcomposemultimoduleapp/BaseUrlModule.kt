package com.emon.jetpackcomposemultimoduleapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class BaseUrlModule{
    @Provides
    @com.emon.di.qualifier.AppBaseUrl
    fun provideBaseUrl():String = "https://api.github.com/"

}

