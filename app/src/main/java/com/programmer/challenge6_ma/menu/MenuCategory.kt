package com.programmer.challenge6_ma.menu

import com.google.gson.annotations.SerializedName

data class MenuCategory(
    @SerializedName("data")
    val data: List<CategoryDataItem>,

    @SerializedName("message")
    val message: String?,

    @SerializedName("status")
    val status: Boolean?
)

data class CategoryDataItem(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("imageUrl")
    val imageUrl: String?,
    @SerializedName("nama")
    val name: String?,
)