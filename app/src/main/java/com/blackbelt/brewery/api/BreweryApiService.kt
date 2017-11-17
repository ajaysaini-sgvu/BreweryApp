package com.blackbelt.brewery.api

import com.blackbelt.brewery.api.model.CategoryResponseModel
import com.blackbelt.brewery.api.model.FeaturedResponseModel
import com.blackbelt.brewery.api.model.StyleResponseModel
import com.blackbelt.brewery.api.model.StylesResponseModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface BreweryApiService {

    @GET("featured")
    fun getFeatured(): Observable<FeaturedResponseModel>

    @GET("styles")
    fun getStyles(): Observable<StylesResponseModel>

    @GET("categories")
    fun getCategories(): Observable<CategoryResponseModel>

    @GET("style/{styleId}")
    fun getStyle(@Path("styleId") styleId: Int): Observable<StyleResponseModel>
}