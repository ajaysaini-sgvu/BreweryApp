package com.blackbelt.brewery

import android.app.Activity
import android.app.Application
import com.blackbelt.brewery.di.DaggerBreweryComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class BreweryApp : Application(), HasActivityInjector {

    @Inject
    lateinit var mAndroidDispatchingInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerBreweryComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = mAndroidDispatchingInjector
}