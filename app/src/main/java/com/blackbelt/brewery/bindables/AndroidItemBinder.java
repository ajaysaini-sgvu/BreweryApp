package com.blackbelt.brewery.bindables;


public class AndroidItemBinder {

    private int mLayoutId;

    private int mBindingVariable;

    public AndroidItemBinder(int layoutId, int bindingVariable) {
        mLayoutId = layoutId;
        mBindingVariable = bindingVariable;
    }

    public int getLayoutId() {
        return mLayoutId;
    }

    public int getDataBindingVariable() {
        return mBindingVariable;
    }

}
