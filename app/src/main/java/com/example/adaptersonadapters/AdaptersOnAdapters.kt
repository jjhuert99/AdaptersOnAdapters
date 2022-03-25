package com.example.adaptersonadapters

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AdaptersOnAdapters: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
