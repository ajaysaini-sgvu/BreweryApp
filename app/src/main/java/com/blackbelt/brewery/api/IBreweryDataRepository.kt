package com.blackbelt.brewery.api

import com.blackbelt.brewery.api.model.CategoryResponseModel
import com.blackbelt.brewery.api.model.FeaturedResponseModel
import com.blackbelt.brewery.api.model.StyleResponseModel
import com.blackbelt.brewery.api.model.StylesResponseModel
import io.reactivex.Observable

interface IBreweryDataRepository {
    fun getFeatured(): Observable<FeaturedResponseModel>
    fun getStyles(): Observable<StylesResponseModel>
    fun getCategories(): Observable<CategoryResponseModel>
    fun getStyle(styleId: Int): Observable<StyleResponseModel>
}