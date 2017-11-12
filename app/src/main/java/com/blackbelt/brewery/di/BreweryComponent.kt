package com.blackbelt.brewery.di

import com.blackbelt.brewery.BreweryApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        BindsModule::class,
        BuildersModule::class,
        NetworkModule::class,
        HelpersModule::class,
        AndroidSupportInjectionModule::class))
interface BreweryComponent {

    fun inject(app: BreweryApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: BreweryApp): Builder

        fun build(): BreweryComponent
    }
}
