package com.blackbelt.brewery.view.misc

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection

open class BaseInjectableFragment : Fragment() {

    private var mAndroidBaseViewModel: BaseViewModel? = null

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context)
    }

    fun onCreateView(inflater: LayoutInflater?,
                     container: ViewGroup?,
                     savedInstanceState: Bundle?,
                     @LayoutRes layoutResId: Int,
                     bindingVariable: Int,
                     baseViewModel: BaseViewModel): View? {

        mAndroidBaseViewModel = baseViewModel
        lifecycle.addObserver(baseViewModel)
        val viewDataBinding = DataBindingUtil.inflate<ViewDataBinding>(inflater, layoutResId, container, false)
        viewDataBinding.setVariable(bindingVariable, baseViewModel)
        return viewDataBinding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        mAndroidBaseViewModel?.let {
            lifecycle.removeObserver(mAndroidBaseViewModel as BaseViewModel)
        }
    }
}