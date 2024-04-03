package com.example.hiltdependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    // To Access FirebaseRepository
    //@Named("firebase")
    @MyQualifier
    @Provides
    fun provideFirebaseRepository() : MainUserRepository{
        return FirebaseRepository()
    }


     //  SQLRepository
    @Named("sql")
    @Provides
    fun provideSQLRepository(sqlRepository: SQLRepository) : MainUserRepository{
        return sqlRepository
    }


    /*@Binds
    abstract fun bindMainUserRepository(sqlRepository: SQLRepository): MainUserRepository
*/
}