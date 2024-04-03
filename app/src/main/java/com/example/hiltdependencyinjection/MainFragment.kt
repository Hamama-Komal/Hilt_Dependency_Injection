package com.example.hiltdependencyinjection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainFragment : Fragment() {

    @MyQualifier
    //@Named("firebase")
    @Inject
    lateinit var mainUserRepository: MainUserRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mainUserRepository.saveNewUser("hamama@gmail.com","1234567")


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }



}