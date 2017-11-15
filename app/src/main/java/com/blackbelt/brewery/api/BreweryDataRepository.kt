package com.blackbelt.brewery.api

import com.blackbelt.brewery.api.model.FeaturedResponseModel
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BreweryDataRepository @Inject constructor(breweryApiService: BreweryApiService) : IBreweryDataRepository {

    val mBreweryApiService = breweryApiService

    override fun getFeatured(): Observable<FeaturedResponseModel> = mBreweryApiService.getFeatured()
}