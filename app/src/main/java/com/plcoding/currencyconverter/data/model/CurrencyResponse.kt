package com.plcoding.currencyconverter.data.model

data class CurrencyResponse(
    val base: String? = null,
    val date: String? = null,
    val rates: MutableMap<String, Double>?=null,
    val success: Boolean? = null,
    val timestamp: Int? = null
)