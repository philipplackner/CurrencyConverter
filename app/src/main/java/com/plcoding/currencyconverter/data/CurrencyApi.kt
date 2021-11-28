package com.plcoding.currencyconverter.data

import com.plcoding.currencyconverter.BuildConfig
import com.plcoding.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        @Query("access_key") apiKey: String = BuildConfig.API_KEY
    ): Response<CurrencyResponse>
}