package com.irsyadcad.weatherapp.utils

import android.app.Application
import com.irsyadcad.weatherapp.dependency_injection.networkModule
import com.irsyadcad.weatherapp.dependency_injection.repositoryModule
import com.irsyadcad.weatherapp.dependency_injection.serializerModule
import com.irsyadcad.weatherapp.dependency_injection.storageModule
import com.irsyadcad.weatherapp.dependency_injection.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppConfig : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppConfig)
            modules(
                listOf(
                    repositoryModule,
                    viewModelModule,
                    serializerModule,
                    storageModule,
                    networkModule
                )
            )
        }
    }
}