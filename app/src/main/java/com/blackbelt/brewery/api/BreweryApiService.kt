package com.blackbelt.brewery.api

import com.blackbelt.brewery.api.model.FeaturedResponseModel
import io.reactivex.Observable
import retrofit2.http.GET

interface BreweryApiService {

    @GET("featured")
    fun getFeatured(): Observable<FeaturedResponseModel>
}