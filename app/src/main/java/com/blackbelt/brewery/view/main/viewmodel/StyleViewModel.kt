package com.blackbelt.brewery.view.main.viewmodel

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.databinding.Bindable
import com.blackbelt.brewery.BR
import com.blackbelt.brewery.api.IBreweryDataRepository
import com.blackbelt.brewery.api.model.Category
import com.blackbelt.brewery.api.model.Style
import com.blackbelt.brewery.view.misc.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposables
import javax.inject.Inject

class StyleViewModel constructor(category: Category?, dataRepository: IBreweryDataRepository) : BaseViewModel() {

    private val mCategory = category
    private val mDataRepository = dataRepository

    private var mDisposable = Disposables.disposed()

    private var mStyle: Style? = null

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        if (mCategory == null) {
            return
        }
        val styleId = mCategory.id ?: return
        mDisposable = mDataRepository.getStyle(styleId)
                .map { styleResponseModel -> styleResponseModel.data }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ style ->
                    mStyle = style
                    notifyPropertyChanged(BR.description)
                }, Throwable::printStackTrace)
    }

    @Bindable
    fun getDescription(): String? = mStyle?.description

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        mDisposable.dispose()
    }

    class Factory @Inject constructor(category: Category?, breweryDataRepository: IBreweryDataRepository) : ViewModelProvider.NewInstanceFactory() {

        private val mCategory = category
        private val mBreweryDataRepository = breweryDataRepository

        override fun <T : ViewModel> create(modelClass: Class<T>): T = StyleViewModel(mCategory, mBreweryDataRepository) as T
    }

}