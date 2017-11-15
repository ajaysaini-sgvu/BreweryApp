package com.blackbelt.brewery.api

import com.blackbelt.brewery.api.model.FeaturedResponseModel
import io.reactivex.Observable

interface IBreweryDataRepository {
    fun getFeatured(): Observable<FeaturedResponseModel>
}