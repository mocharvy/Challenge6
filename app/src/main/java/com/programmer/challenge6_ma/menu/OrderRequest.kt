package com.programmer.challenge6_ma.menu

data class OrderRequest(
    val orders: List<OrderRequestItem>,
    val total: Int?,
    val username: String?
)

data class OrderRequestItem(
    val catatan: String?,
    val harga: Int?,
    val nama: String?,
    val qty: Int?
)