package com.example.hiltdependencyinjection


import javax.inject.Inject

// Constructor Injection
class UserRepository @Inject constructor(val loggerService: LoggerService) {

    fun saveUser(email: String, password: String, call: String){

        loggerService.log("User Save in DB -$call")
    }
}