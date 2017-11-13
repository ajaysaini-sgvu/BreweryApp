package com.blackbelt.brewery.view.misc

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

open abstract class BaseInjectableActivity : AppCompatActivity(), IErrorDelegate, HasSupportFragmentInjector {

    @Inject
    lateinit var mDispatchingAndroidFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    fun setContentView(@LayoutRes layoutId: Int, brVariable: Int, viewModel: BaseViewModel) {
        val dataBiding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, layoutId, null, false)
        dataBiding.setVariable(brVariable, viewModel)
        viewModel.setErrorDelegate(this)
        super.setContentView(dataBiding.root)
    }

    override fun setContentView(layoutResID: Int) {
    }

    override fun setContentView(view: View?) {
    }

    override fun onError(throwable: Throwable) {
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = mDispatchingAndroidFragmentInjector
}