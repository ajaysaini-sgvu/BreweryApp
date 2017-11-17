package com.blackbelt.brewery.view.home.viewmodel

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.databinding.Bindable
import android.os.Bundle
import com.blackbelt.brewery.BR
import com.blackbelt.brewery.api.IBreweryDataRepository
import com.blackbelt.brewery.view.adapter.model.FragmentModel
import com.blackbelt.brewery.view.main.MainFragment
import com.blackbelt.brewery.view.misc.BaseViewModel
import javax.inject.Inject


class MainViewModel constructor(breweryDataRepository: IBreweryDataRepository) : BaseViewModel() {

    private val mBreweryDataRepository = breweryDataRepository

    private var mCategoriesDataSet = mutableListOf<FragmentModel>()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        loadCategories()
    }

    private fun loadCategories() {
        mBreweryDataRepository
                .getCategories()
                .filter { it -> it.data != null }
                .map { it -> ArrayList(it.data) }
                .map { it ->
                    it.map { item ->
                        val bundle = Bundle()
                        if (item.id != null) {
                            bundle.putParcelable("category", item)
                        }
                        mCategoriesDataSet.add(FragmentModel(item.name, MainFragment::class.java, bundle))
                    }
                }.subscribe({
            notifyPropertyChanged(BR.categories)
        }, Throwable::printStackTrace)
    }

    @Bindable
    fun getCategories(): List<FragmentModel> = mCategoriesDataSet

    class Factory @Inject constructor(breweryDataRepository: IBreweryDataRepository) : ViewModelProvider.NewInstanceFactory() {

        val mBreweryDataRepository = breweryDataRepository

        override fun <T : ViewModel> create(modelClass: Class<T>): T = MainViewModel(mBreweryDataRepository) as T
    }
}