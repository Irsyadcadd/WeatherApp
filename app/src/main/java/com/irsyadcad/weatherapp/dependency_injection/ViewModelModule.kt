package com.irsyadcad.weatherapp.dependency_injection

import com.irsyadcad.weatherapp.fragments.home.HomeViewModel
import com.irsyadcad.weatherapp.fragments.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(weatherDataRepository = get()) }
    viewModel { LocationViewModel(weatherDataRepository = get()) }
}