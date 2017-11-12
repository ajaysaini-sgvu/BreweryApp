package com.blackbelt.brewery.bindables

data class PageDescriptor private constructor(private val builder: PageDescriptorBuilder) {

    private var mStartPage = 1

    private var mPageSize = 20

    private var mThreshold = 5

    private var mCurrentPage: Int

    companion object PageDescriptorBuilder {

        private var mStartPage = 1

        private var mPageSize = 20

        private var mThreshold = 5

        fun setStartPage(startPage: Int): PageDescriptorBuilder {
            mStartPage = startPage
            return this
        }

        fun setPageSize(pageSize: Int): PageDescriptorBuilder {
            mPageSize = pageSize
            return this
        }

        fun setThreshold(threshold: Int): PageDescriptorBuilder {
            mThreshold = threshold
            return this
        }

        fun build(): PageDescriptor {
            return PageDescriptor(this)
        }
    }

    init {
        mStartPage = builder.mStartPage
        mPageSize = builder.mPageSize
        mThreshold = builder.mThreshold
        mCurrentPage = mStartPage
    }

    fun setCurrentPage(page: Int) {
        mCurrentPage = page
    }

    fun getCurrentPage(): Int {
        return mCurrentPage
    }

    fun getThreshold(): Int {
        return mThreshold
    }

    fun getPageSize(): Int {
        return mPageSize
    }

    fun getStartPage(): Int {
        return mStartPage
    }
}
