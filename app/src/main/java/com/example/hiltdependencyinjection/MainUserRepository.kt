package com.example.hiltdependencyinjection

import android.util.Log
import javax.inject.Inject

interface MainUserRepository{
     fun saveNewUser(email: String, password: String)
}

class SQLRepository @Inject constructor(): MainUserRepository{
    override fun saveNewUser(email: String, password: String) {
        Log.d("TESTING", "Data of new User save in Database")
    }

}

class FirebaseRepository : MainUserRepository{
    override fun saveNewUser(email: String, password: String) {
        Log.d("TESTING", "Data of new User save in Firebase")
    }

}