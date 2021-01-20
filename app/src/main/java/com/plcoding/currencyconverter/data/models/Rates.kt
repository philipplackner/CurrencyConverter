package com.plcoding.currencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class Rates(
    @SerializedName("AUD")
    val aUD: Double,
    @SerializedName("BGN")
    val bGN: Double,
    @SerializedName("EUR")
    val eUR: Double,
    @SerializedName("BRL")
    val bRL: Double,
    @SerializedName("CAD")
    val cAD: Double,
    @SerializedName("CHF")
    val cHF: Double,
    @SerializedName("CNY")
    val cNY: Double,
    @SerializedName("CZK")
    val cZK: Double,
    @SerializedName("DKK")
    val dKK: Double,
    @SerializedName("GBP")
    val gBP: Double,
    @SerializedName("HKD")
    val hKD: Double,
    @SerializedName("HRK")
    val hRK: Double,
    @SerializedName("HUF")
    val hUF: Double,
    @SerializedName("IDR")
    val iDR: Double,
    @SerializedName("ILS")
    val iLS: Double,
    @SerializedName("INR")
    val iNR: Double,
    @SerializedName("ISK")
    val iSK: Double,
    @SerializedName("JPY")
    val jPY: Double,
    @SerializedName("KRW")
    val kRW: Double,
    @SerializedName("MXN")
    val mXN: Double,
    @SerializedName("MYR")
    val mYR: Double,
    @SerializedName("NOK")
    val nOK: Double,
    @SerializedName("NZD")
    val nZD: Double,
    @SerializedName("PHP")
    val pHP: Double,
    @SerializedName("PLN")
    val pLN: Double,
    @SerializedName("RON")
    val rON: Double,
    @SerializedName("RUB")
    val rUB: Double,
    @SerializedName("SEK")
    val sEK: Double,
    @SerializedName("SGD")
    val sGD: Double,
    @SerializedName("THB")
    val tHB: Double,
    @SerializedName("TRY")
    val tRY: Double,
    @SerializedName("USD")
    val uSD: Double,
    @SerializedName("ZAR")
    val zAR: Double
)