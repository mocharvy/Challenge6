package com.programmer.challenge6_ma.menu

import com.google.gson.annotations.SerializedName

data class MenuCategory(
    @SerializedName("data")
    val data: List<DataCategory>,
    @SerializedName("message")
    val message: String?,
    @SerializedName("status")
    val status: Boolean?
)