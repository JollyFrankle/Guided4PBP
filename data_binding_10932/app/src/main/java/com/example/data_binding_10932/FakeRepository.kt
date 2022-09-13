package com.example.data_binding_10932

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apel", "Mangga", "Pisang", "Anggur", "Stroberi",
        "Jeruk", "Nanas", "Semangka", "Melon", "Pepaya"
    )

    private val _currentFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentFruitName

    init {
        _currentFruitName.value = fruitNames[0]
    }

    fun getRandomFruitName(): String {
        return fruitNames.random()
    }

    fun changeCurrentRandomFruitName() {
        _currentFruitName.value = getRandomFruitName()
    }
}