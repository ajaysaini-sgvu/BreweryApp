package com.blackbelt.brewery.view.utils

import android.databinding.BindingAdapter
import android.support.v4.view.ViewPager
import com.blackbelt.brewery.view.adapter.MainFragmentStatePagerAdapter
import com.blackbelt.brewery.view.adapter.model.FragmentModel


@BindingAdapter("fragmentAdapterDataSet")
fun setStagePageAdapter(viewPager: ViewPager, dataSet: List<FragmentModel>) {
    if (viewPager.adapter == null) {
        return
    }
    val adapter = viewPager.adapter as? MainFragmentStatePagerAdapter ?: return
    adapter.setDataSet(dataSet)
}