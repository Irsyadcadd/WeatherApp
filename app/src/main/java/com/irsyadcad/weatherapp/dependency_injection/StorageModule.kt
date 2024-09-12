package com.irsyadcad.weatherapp.dependency_injection

import com.irsyadcad.weatherapp.storage.SharedPreferencesManager
import org.koin.dsl.module

val storageModule = module {
    single { SharedPreferencesManager(context = get(), gson = get()) }
}