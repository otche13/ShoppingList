package ru.otche13.shoppinglist.domain

import androidx.lifecycle.MutableLiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId:Int): ShopItem

    fun getShopList(): MutableLiveData<List<ShopItem>>
}