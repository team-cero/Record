package com.example.record

import androidx.annotation.UiThread
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * MainViewModel
 **/
class MainViewModel : ViewModel() {

    val distanceCountList = MutableLiveData<MutableList<Int>>()

    init {
        distanceCountList.value = mutableListOf()
    }

    //list

    @UiThread
    fun addDistanceCount(count: Int) {
        val list = distanceCountList.value ?: return
        list.add(count)
        distanceCountList.value = list //
    }
}
