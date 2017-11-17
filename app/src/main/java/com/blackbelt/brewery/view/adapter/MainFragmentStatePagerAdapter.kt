package com.blackbelt.brewery.view.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.util.SparseArray
import com.blackbelt.brewery.view.adapter.model.FragmentModel

class MainFragmentStatePagerAdapter(activity: AppCompatActivity, private var mDataSet: List<FragmentModel> = ArrayList())
    : FragmentPagerAdapter(activity.supportFragmentManager) {

    private var mActivity = activity

    private val mFragmentCache: SparseArray<Fragment> = SparseArray()

    override fun getItem(position: Int): Fragment? {
        if (mFragmentCache.get(position) == null) {
            val (_, fragment1, bundle) = mDataSet[position]
            val fragment = Fragment.instantiate(mActivity,
                    fragment1?.name, bundle)
            mFragmentCache.put(position, fragment)
        }
        return mFragmentCache.get(position)
    }

    fun setDataSet(dataSet: List<FragmentModel>) {
        mDataSet = dataSet
        notifyDataSetChanged()
    }

    override fun getCount(): Int = mDataSet.size

    override fun getPageTitle(position: Int): CharSequence? = mDataSet[position].title
}