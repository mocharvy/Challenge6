package com.programmer.challenge6_ma.menu

data class OrderRequest(
    val orders: List<Order>,
    val total: Int?,
    val username: String?
)
