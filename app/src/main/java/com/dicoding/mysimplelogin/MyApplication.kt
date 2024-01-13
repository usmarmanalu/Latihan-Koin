package com.dicoding.mysimplelogin

import android.app.*
import org.koin.android.ext.koin.*
import org.koin.core.context.*

open class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(storageModule)
        }
    }
}