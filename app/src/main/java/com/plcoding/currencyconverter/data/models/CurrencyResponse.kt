package com.plcoding.currencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates,
    val success: Boolean,
    val timestamp: Int
)