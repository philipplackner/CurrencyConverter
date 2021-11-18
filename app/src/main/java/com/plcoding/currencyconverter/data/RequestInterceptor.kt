package com.plcoding.currencyconverter.data

import com.plcoding.currencyconverter.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url
        val url = originalHttpUrl.newBuilder()
            .addQueryParameter("access_key", BuildConfig.EXCHANGE_RATE_API_KEY)
            .build()
        val request = original.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}