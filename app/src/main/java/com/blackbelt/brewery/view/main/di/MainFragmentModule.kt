package com.blackbelt.brewery.view.main.di

import com.blackbelt.brewery.api.model.Category
import com.blackbelt.brewery.view.main.MainFragment
import dagger.Module
import dagger.Provides
import io.reactivex.annotations.Nullable

@Module
class MainFragmentModule {

    @Provides
    @Nullable
    fun provideCategory(fragment: MainFragment): Category? = fragment.arguments?.getParcelable("category")
}

