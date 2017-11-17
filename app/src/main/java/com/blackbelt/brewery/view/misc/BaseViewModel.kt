package com.blackbelt.brewery.view.misc

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.Observable
import android.databinding.PropertyChangeRegistry


open class BaseViewModel : ViewModel(), Observable, LifecycleObserver {

    @Transient
    private var mCallbacks: PropertyChangeRegistry? = null

    private val mErrorLiveData = MutableLiveData<Throwable>()

    protected var mErrorDelegate: IErrorDelegate? = null

    override fun removeOnPropertyChangedCallback(p0: Observable.OnPropertyChangedCallback?) {
        synchronized(this) {
            if (mCallbacks == null) {
                mCallbacks = PropertyChangeRegistry()
            }
        }
        mCallbacks?.remove(p0)
    }

    override fun addOnPropertyChangedCallback(p0: Observable.OnPropertyChangedCallback?) {
        synchronized(this) {
            if (mCallbacks == null) {
                mCallbacks = PropertyChangeRegistry()
            }
        }
        mCallbacks?.add(p0)
    }

    fun notifyChange() {
        synchronized(this) {
            if (mCallbacks == null) {
                return
            }
        }
        mCallbacks?.notifyCallbacks(this, 0, null)
    }

    fun notifyPropertyChanged(fieldId: Int) {
        synchronized(this) {
            if (mCallbacks == null) {
                return
            }
        }
        mCallbacks?.notifyCallbacks(this, fieldId, null)
    }

    fun getErrorDelegate(): MutableLiveData<Throwable> = mErrorLiveData

    fun setErrorDelegate(errorDelegate: IErrorDelegate) {
        mErrorDelegate = errorDelegate
    }

    override fun onCleared() {
        super.onCleared()
        mErrorDelegate = null
    }
}