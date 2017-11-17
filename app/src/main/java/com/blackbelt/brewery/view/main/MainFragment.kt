package com.blackbelt.brewery.view.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.blackbelt.brewery.BR
import com.blackbelt.brewery.R
import com.blackbelt.brewery.view.main.viewmodel.StyleViewModel
import com.blackbelt.brewery.view.misc.BaseInjectableFragment
import javax.inject.Inject

class MainFragment : BaseInjectableFragment() {

    @Inject
    lateinit var mFactory: StyleViewModel.Factory

    val mStyleViewModel: StyleViewModel by lazy {
        ViewModelProviders.of(this, mFactory).get(StyleViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            onCreateView(inflater, container, savedInstanceState, R.layout.fragment_main, BR.styleViewModel, mStyleViewModel)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView: TextView? = view?.findViewById(R.id.main)
        textView?.text = arguments?.getInt("id", 0).toString()
    }
}