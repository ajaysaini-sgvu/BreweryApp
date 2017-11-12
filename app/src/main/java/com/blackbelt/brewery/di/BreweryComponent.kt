package com.blackbelt.brewery.di

import android.app.Application
import com.blackbelt.brewery.BreweryApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class))
interface BreweryComponent {

    fun inject(app: Application)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: BreweryApp): Builder

        fun build(): BreweryComponent
    }
}
