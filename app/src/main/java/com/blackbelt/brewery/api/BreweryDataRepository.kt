package com.blackbelt.brewery.api

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BreweryDataRepository @Inject constructor(breweryApiService: BreweryApiService) : IBreweryDataRepository {

    val mBreweryApiService = breweryApiService
}