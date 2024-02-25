package com.example.besokmasak.core

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApplicationClass : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}