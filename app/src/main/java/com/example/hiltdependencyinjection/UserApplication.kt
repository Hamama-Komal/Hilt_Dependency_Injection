package com.example.hiltdependencyinjection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

    // Hilt Field Injection
    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

       // userRepository.saveUser("hamama@gmail.com","1234567","Call From Application")
    }
}