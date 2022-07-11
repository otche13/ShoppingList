package ru.otche13.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.otche13.shoppinglist.data.ShopListRepositoryImpl
import ru.otche13.shoppinglist.domain.DeleteShopItemUseCase
import ru.otche13.shoppinglist.domain.EditShopItemUseCase
import ru.otche13.shoppinglist.domain.GetShopListUseCase
import ru.otche13.shoppinglist.domain.ShopItem

class MainViewModel: ViewModel(){

    private val repository=ShopListRepositoryImpl

    private val getShopListUseCase=GetShopListUseCase(repository)
    private val deleteShopItemUseCase=DeleteShopItemUseCase(repository)
    private val editShopItemUseCase=EditShopItemUseCase(repository)

    val shopList=getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}