package com.plcoding.currencyconverter.data

import com.plcoding.currencyconverter.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(): Response<CurrencyResponse>
}