package com.irsyadcad.weatherapp.dependency_injection

import com.irsyadcad.weatherapp.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { WeatherDataRepository(weatherAPI = get()) }
}