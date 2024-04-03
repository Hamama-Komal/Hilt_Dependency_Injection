package com.example.hiltdependencyinjection

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String, call: String){

        Log.d("TESTING","User Save in DB -$call")
    }
}