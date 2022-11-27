package com.jatri.jatriuser

import com.jatri.di.qualifier.AppBaseUrl
import com.jatri.di.qualifier.AppImageBaseUrl
import com.jatri.di.qualifier.GuaranteeSetBaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.jatri.di.qualifier.PaymentGateWayBaseUrl


@Module
@InstallIn(SingletonComponent::class)
class BaseUrlModule{
    @Provides
    @AppBaseUrl
    fun provideBaseUrl():String = "https://api.github.com/"

}

