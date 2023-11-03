package com.programmer.challenge6_ma.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.programmer.challenge6_ma.Resource
import com.programmer.challenge6_ma.api.ApiClient
import com.programmer.challenge6_ma.menu.CategoryDataItem
import com.programmer.challenge6_ma.menu.MenuListData
import com.programmer.challenge6_ma.repository.MenuRepository

class MenuViewModel(private val menuRepository: MenuRepository) : ViewModel() {

    fun getMenuItems(): LiveData<Resource<List<MenuListData>>> {
        return menuRepository.getMenuItems()
    }

    fun getCategoryMenu(): LiveData<Resource<List<CategoryDataItem>>> {
        return menuRepository.getCategoryMenu()
    }

    class ViewModelFactory(private val client: ApiClient) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when {
                modelClass.isAssignableFrom(MenuViewModel::class.java) -> {
                    val menuRepository = MenuRepository(client)
                    MenuViewModel(menuRepository) as T
                }
                else -> {
                    throw IllegalArgumentException("ViewModel tidak terdefinisi!")
                }
            }
        }
    }
}
