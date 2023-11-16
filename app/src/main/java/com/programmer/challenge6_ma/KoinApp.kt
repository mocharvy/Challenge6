package com.programmer.challenge6_ma

import android.app.Application
import com.programmer.challenge6_ma.di.KoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidLogger()
            androidContext(this@KoinApp)
            modules(KoinModule.module)
        }
    }
}
