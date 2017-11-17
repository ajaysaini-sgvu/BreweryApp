package com.blackbelt.brewery.api

import com.blackbelt.brewery.api.model.CategoryResponseModel
import com.blackbelt.brewery.api.model.FeaturedResponseModel
import com.blackbelt.brewery.api.model.StyleResponseModel
import com.blackbelt.brewery.api.model.StylesResponseModel
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BreweryDataRepository @Inject constructor(breweryApiService: BreweryApiService) : IBreweryDataRepository {

    val mBreweryApiService = breweryApiService

    override fun getFeatured(): Observable<FeaturedResponseModel> = mBreweryApiService.getFeatured()

    override fun getStyles(): Observable<StylesResponseModel> = mBreweryApiService.getStyles()

    override fun getCategories(): Observable<CategoryResponseModel> = mBreweryApiService.getCategories()

    override fun getStyle(styleId: Int): Observable<StyleResponseModel> = mBreweryApiService.getStyle(styleId)
}