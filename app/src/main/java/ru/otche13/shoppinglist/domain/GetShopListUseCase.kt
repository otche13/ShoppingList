package ru.otche13.shoppinglist.domain

import androidx.lifecycle.MutableLiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList():  MutableLiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}