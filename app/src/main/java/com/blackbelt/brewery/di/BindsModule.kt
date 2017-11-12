package com.blackbelt.brewery.di

import com.blackbelt.brewery.api.BreweryDataRepository
import com.blackbelt.brewery.api.IBreweryDataRepository
import dagger.Binds
import dagger.Module

@Module
abstract class BindsModule {

    @Binds
    abstract fun bindBreweryDataRepository(breweryDataRepository: BreweryDataRepository): IBreweryDataRepository
}