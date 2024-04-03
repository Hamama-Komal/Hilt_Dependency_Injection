package com.example.hiltdependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {

    /*    // To Access FirebaseRepository
    @Provides
    fun provideMainUserRepository() : MainUserRepository{
        return FirebaseRepository()
    }
    */


    /* //  SQLRepository
    @Provides
    fun provideMainUserRepository(sqlRepository: SQLRepository) : MainUserRepository{
        return sqlRepository
    }
    */


    @Binds
    abstract fun bindMainUserRepository(sqlRepository: SQLRepository): MainUserRepository

}