package com.blackbelt.brewery.api

import com.blackbelt.brewery.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

private const val API_KEY = BuildConfig.API_KEY

class ApiKeyInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {


        val original = chain.request()
        val originalHttpUrl = original.url()

        val url = originalHttpUrl.newBuilder()
                .addQueryParameter("key", API_KEY)
                .build()

        val requestBuilder = original.newBuilder()
                .url(url)

        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}