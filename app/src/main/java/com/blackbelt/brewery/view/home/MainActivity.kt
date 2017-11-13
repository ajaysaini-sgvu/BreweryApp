package com.blackbelt.brewery.view.home

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.android.databinding.library.baseAdapters.BR
import com.blackbelt.brewery.R
import com.blackbelt.brewery.view.home.viewmodel.MainViewModel
import com.blackbelt.brewery.view.misc.BaseInjectableActivity

class MainActivity : BaseInjectableActivity() {

    private val mViewModel : MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main, BR.viewModel, mViewModel)
    }
}
