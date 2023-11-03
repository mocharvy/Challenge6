package com.programmer.challenge6_ma.menu

import com.google.gson.annotations.SerializedName

data class Order(
    @SerializedName("message")
    val message: String?,
    @SerializedName("code")
    val code: Int?,
    @SerializedName("status")
    val status: Boolean?
)