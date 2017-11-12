package com.blackbelt.brewery.di

import android.content.Context
import com.blackbelt.brewery.BreweryApp
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HelpersModule {

    @Provides
    fun provideContext(app : BreweryApp) : Context = app.applicationContext

    @Singleton
    @Provides
    fun provideGson(): Gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
}