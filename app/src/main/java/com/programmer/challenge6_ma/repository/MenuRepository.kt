package com.programmer.challenge6_ma.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.programmer.challenge6_ma.Resource
import com.programmer.challenge6_ma.api.ApiClient
import com.programmer.challenge6_ma.menu.CategoryDataItem
import com.programmer.challenge6_ma.menu.MenuListData

private val Any.data: List<MenuListData>
    get() {
        TODO("Not yet implemented")
    }

class MenuRepository(private val apiService: ApiClient) {

    fun getMenuItems(): LiveData<Resource<List<MenuListData>>>
            = liveData {
        emit(Resource.Loading())
        try {
            val response = apiService.getMenuItems()
            emit(Resource.Success(response.data))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }

    fun getCategoryMenu(): LiveData<Resource<List<CategoryDataItem>>>
            = liveData {
        emit(Resource.Loading())
        try {
            val response = apiService.getCategoryMenu()
            emit(Resource.Success(response.data))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }

    private fun emit(value: Resource.Success<List<MenuListData>>) {
        TODO("Not yet implemented")
    }
}

private fun ApiClient.getCategoryMenu(): Any = Unit

private fun ApiClient.getMenuItems(): Any {
    TODO("Not yet implemented")
}
