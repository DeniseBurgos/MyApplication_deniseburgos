package com.myapplication_deniseburgos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val resultLiveData = MutableLiveData<String>()

    fun getResultLiveData(): LiveData<String> {
        return resultLiveData
    }

    fun compareStrings(text1: String, text2: String) {
        if (text1 == text2) {
            resultLiveData.value = "Las cadenas son iguales."
        } else {
            resultLiveData.value = "Las cadenas no son iguales."
        }
    }
}

