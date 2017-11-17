package com.blackbelt.brewery.view.home

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.android.databinding.library.baseAdapters.BR
import com.blackbelt.brewery.R
import com.blackbelt.brewery.view.adapter.MainFragmentStatePagerAdapter
import com.blackbelt.brewery.view.home.viewmodel.MainViewModel
import com.blackbelt.brewery.view.misc.BaseInjectableActivity
import javax.inject.Inject

class MainActivity : BaseInjectableActivity() {

    private val mViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, mFactory).get(MainViewModel::class.java)
    }

    @Inject
    lateinit var mFactory: MainViewModel.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main, BR.viewModel, mViewModel)

        val viewPager: ViewPager = findViewById(R.id.main_view_pager)
        viewPager.adapter = MainFragmentStatePagerAdapter(this)

        val tabLayout: TabLayout = findViewById(R.id.main_tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}
