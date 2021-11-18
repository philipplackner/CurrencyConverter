package com.plcoding.currencyconverter.repository

import com.plcoding.currencyconverter.data.model.CurrencyResponse
import com.plcoding.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(): Resource<CurrencyResponse>
}