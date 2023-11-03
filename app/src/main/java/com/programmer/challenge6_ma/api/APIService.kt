package com.programmer.challenge6_ma.api

import com.programmer.challenge6_ma.menu.MenuCategory
import com.programmer.challenge6_ma.menu.MenuList
import com.programmer.challenge6_ma.menu.Order
import com.programmer.challenge6_ma.menu.OrderRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface APIService {
    @GET("menulist")
    suspend fun getMenuItems(): MenuList

    @GET("menu-category")
    suspend fun getMenuCategory(): MenuCategory

    @POST("order-menu")
    suspend fun orderMenu(
        @Body orderRequest: OrderRequest,
    ): Order
}
