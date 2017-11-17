package com.blackbelt.brewery.di

import com.blackbelt.brewery.view.home.MainActivity
import com.blackbelt.brewery.view.main.MainFragment
import com.blackbelt.brewery.view.main.di.MainFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = arrayOf(MainFragmentModule::class))
    abstract fun bindMainFragment(): MainFragment
}