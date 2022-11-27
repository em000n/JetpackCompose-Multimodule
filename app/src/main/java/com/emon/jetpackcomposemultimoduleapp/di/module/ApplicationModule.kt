package com.emon.jetpackcomposemultimoduleapp.di.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

  /*  @Provides
    fun sharePrefHelper(@ApplicationContext context: Context): SharedPrefHelper =
        SharedPrefHelper(context)
*/
  /*  @Provides
    @Singleton
    fun provideAuthRefreshServiceHolder() : AuthRefreshServiceHolder = AuthRefreshServiceHolder()
*/
  /*  @Provides
    @Singleton
    fun provideRentalReturnTripDeeplinkHandler(gson: Gson) : RentalReturnTripDeeplinkHandler = RentalReturnTripDeeplinkHandler(gson)

    @Provides
    @Singleton
    fun provideRentalDeeplinkHandler(gson: Gson) : RentalDeeplinkHandler = RentalDeeplinkHandler(gson)*/
}